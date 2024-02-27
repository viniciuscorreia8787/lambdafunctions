package com.lambdafunctions;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import com.amazonaws.services.lambda.runtime.Context;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
import com.google.gson.Gson;
import com.lambdafunctions.LexObjects.*;

public class MyTest {

    public static void main(String[] args){

        System.out.println("Process Start!");

        //Gson gson = new Gson();
        //Search lambda = new Search();
        Context context = new TestContext();  
        
        //Initialize Request Object
        Request request = new Request();

        request.setMessageVersion("1.0");
        request.setInvocationSource("FulfillmentCodeHook");
        request.setInputMode("Text");
        request.setResponseContentType("text/plain; charset=utf-8");
        request.setSessionId("myUniqueSessionId");
        request.setInputTranscript("Transcription of my inpyut");
        request.setInvocationLabel("invocationLabel");
        
        Bot bot = new Bot();
        bot.setId("myUniqueBotId");
        bot.setName("Bot Name");
        bot.setLocaleId("pt_BR");
        bot.setVersion("LATEST");
        bot.setAliasId("MyAliasID");
        bot.setAliasName("Name of my alias");
        request.setBot(bot);

        List<Interpretation> interpretations;
        Interpretation interpretation = new Interpretation();
        interpretation.setInterpretationSource("Lex");
        interpretation.setNluConfidence(0.8);

        Intent intent = new Intent();
        intent.setConfirmationState("Confirmed");
        intent.setName("MyIntentName");
        intent.setState("Fulfilled");
        /***
        intent.setSlots();
        ***/    
        interpretation.setIntent(intent);

        SentimentResponse sentimentResponse = new SentimentResponse();
        sentimentResponse.setSentiment("POSITIVE");

        SentimentScore sentimentScore = new SentimentScore();
        sentimentScore.setPositive(0.9);
        sentimentScore.setMixed(0.1);
        sentimentScore.setNeutral(0.2);
        sentimentScore.setNegative(0.3);
        sentimentResponse.setSentimentScore(sentimentScore);

        interpretation.setSentimentResponse(sentimentResponse);

        request.setInterpretations(Collections.singletonList(interpretation));       
        
        ProposedNextState proposedNextState = new ProposedNextState();
        
        DialogAction dialogAction = new DialogAction();
        dialogAction.setSlotToElicit("MySlotToElicit");
        dialogAction.setType("ConfirmIntent");
        proposedNextState.setDialogAction(dialogAction);

        Intent intent1 = new Intent();
        intent1.setConfirmationState("Confirmed");
        intent1.setName("MyIntentName");
        intent1.setState("Fulfilled");
        /***
        intent.setSlots();
        ***/
        proposedNextState.setIntent(intent1);

        Prompt prompt = new Prompt();
        prompt.setAttempt("My Attempt");
        proposedNextState.setPrompt(prompt);

        Map<String, String> requestAttributes = Map.of(
            "ReqAttribute1", "1",
            "ReqAttribute2", "2"
        );
        request.setRequestAttributes(requestAttributes);

        SessionState sessionState = new SessionState();

        List<ActiveContext> activeContexts;
        ActiveContext activeContext = new ActiveContext();
        activeContext.setName("Name of Active Context");
        Map<String, String> contextAttributes = Map.of(
            "ContAttribute1", "1",
            "ContAttribute2", "2"
        );
        activeContext.setContextAttributes(contextAttributes);

        TimeToLive timeToLive = new TimeToLive();
        timeToLive.setTimeToLiveInSeconds(1000);
        timeToLive.setTurnsToLive(50);
        activeContext.setTimeToLive(timeToLive);

        sessionState.setActiveContexts( Collections.singletonList(activeContext) );


        Map<String, String> sessionAttributes = Map.of(
            "SessAttribute1", "1",
            "SessAttribute2", "2"
        );

        DialogAction dialogAction2 = new DialogAction();
        dialogAction2.setSlotElicitationStyle("Default");
        dialogAction2.setSlotToElicit("SlotToBeElicited");
        dialogAction2.setType("ConfirmIntent");
        sessionState.setDialogAction(dialogAction2);

        Intent intent2 = new Intent();
        intent2.setConfirmationState("Confirmed");
        intent2.setName("MyIntentName");
        intent2.setState("Fulfilled");
        /***
        intent2.setSlots();
        ***/        
        sessionState.setIntent(intent2);
        sessionState.setOriginatingRequestId("MyUniqueOriginalRequestID");
        request.setSessionState(sessionState);

        /*** TO DO TRANSCRIPTIONS ***/
        //https://docs.aws.amazon.com/lexv2/latest/dg/lambda-input-format.html

        System.out.println("End of execution");
    }
}