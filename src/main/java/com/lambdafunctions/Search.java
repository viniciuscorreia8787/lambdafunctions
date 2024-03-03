package com.lambdafunctions;

import java.util.Collections;
import java.util.Map;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.amazonaws.services.lambda.runtime.Context;
import com.lambdafunctions.LexObjects.*;


public class Search implements RequestHandler<Map<String, Object>, Object>  {
    @Override
    
    public Object handleRequest(Map<String, Object> inputMap, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log(inputMap.toString());//Just to show the input in the CloudWatch log

        Gson gson = new Gson();
        System.out.println("*** INPUT OBJECT ***");
        System.out.println(gson.toJson(inputMap));

        /*** Nao sei se vou usar isso aqui...
        Request request = Request.createFrom(input);
        logInputProperties(logger, request);
        //Find intent-handle strategy by IntentName
        IntentHandlerStrategy intentHandlerStrategy = IntentHandlerStrategyFactory.getBy(request.getIntentName());
        //Handle the request for the intent
        return intentHandlerStrategy.handle(request, logger);
        ***/

        Request request = new ObjectMapper().convertValue(inputMap, Request.class);
        Response response;

        if(request.getInputTranscript()=="Vinicius"){
            response = createElicitIntentResponse();
        }else{
            response = createCloseResponse(request);
        }

        return response;
    }

    public static Response createElicitIntentResponse(){

        DialogAction dialogAction = new DialogAction();
        dialogAction.setType("ElicitIntent");
        SessionState sessionState = new SessionState();
        sessionState.setDialogAction(dialogAction);

        Message message = new Message();
        message.setContentType("PlainText");
        message.setContent("Vinicius não é permitido. Favor escolher outro nome.");

        Response response = new Response();
        response.setSessionState(sessionState);
        response.setMessages(Collections.singletonList(message));        

        return response;
    }

    public static Response createDelegateResponse(){
        
        DialogAction dialogAction = new DialogAction();
        dialogAction.setType("Delegate");
        SessionState sessionState = new SessionState();
        sessionState.setDialogAction(dialogAction);
        Response response = new Response();
        response.setSessionState(sessionState);

        return response; 
    }

    public static Response createCloseResponse(Request request){

        DialogAction dialogAction = new DialogAction();
        dialogAction.setType("Close");

        Intent intent = new Intent();
        intent.setName(request.getInterpretations().get(0).getIntent().getName()); 
        intent.setState("Fulfilled");

        SessionState sessionState = new SessionState();
        sessionState.setDialogAction(dialogAction);
        sessionState.setIntent(intent);

        Response response = new Response();
        response.setSessionState(sessionState);
        response.setSessionState(sessionState);

        return response;
    }
}
