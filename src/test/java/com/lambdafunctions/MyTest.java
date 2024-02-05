package com.lambdafunctions;

import com.amazonaws.services.lambda.runtime.Context;
import com.google.gson.Gson;

public class MyTest {

    public static void main(String[] args){

        System.out.println("Process Start!");

        // Create Input JSon
        String jsonInputString = "{" +
        "   \"inputMode\": \"Text\"," +
        "   \"sessionId\": \"851725315467696\"," +
        "   \"inputTranscript\": \"Boa. O que tem de bom na TV hoje?\"," +
        "   \"interpretations\": [" +
        "       {" +
        "           \"interpretationSource\": \"Lex\"," +
        "           \"nluConfidence\": 0.73," +
        "           \"intent\": {" +
        "           \"name\": \"ChooseLiveContent\"," +
        "           \"slots\": {}," +
        "           \"state\": \"InProgress\"," +
        "           \"confirmationState\": \"None\"" +
        "           }" +
        "      }," +
        "      {" +
        "           \"interpretationSource\": \"Lex\"," +
        "           \"intent\": {" +
        "           \"name\": \"FallbackIntent\"," +
        "           \"slots\": {}," +
        "           \"state\": \"InProgress\"," +
        "           \"confirmationState\": \"None\"" +
        "      }" +
        "      }," +
        "      {" +
        "           \"interpretationSource\": \"Lex\"," +
        "            \"nluConfidence\": 0.53," +
        "            \"intent\": {" +
        "                \"name\": \"Greetings\"," +
        "                \"slots\": {" +
        "                \"ClientName\": {" +
        "                \"value\": {" +
        "                            \"originalValue\": \"Vinicius\"," +
        "                            \"resolvedValues\": []," +
        "                            \"interpretedValue\": \"Vinicius\"" +
        "                        }," +
        "                       \"shape\": \"Scalar\"" +
        "                    }" +
        "                }," +
        "                \"state\": \"InProgress\"," +
        "                \"confirmationState\": \"None\"" +
        "            }" +
        "        }," +
        "        {" +
        "            \"interpretationSource\": \"Lex\"," +
        "            \"nluConfidence\": 0.4," +
        "            \"intent\": {" +
        "               \"name\": \"OrderFlowers\"," +
        "                \"slots\": {}," +
        "                \"state\": \"InProgress\"," +
        "                \"confirmationState\": \"None\"" +
        "            }" +
        "        }" +
        "    ]," +
        "    \"bot\": {" +
        "        \"name\": \"MyFirstOrderFlower\"," +
        "        \"version\": \"DRAFT\"," +
        "        \"localeId\": \"pt_BR\"," +
        "        \"id\": \"QDSXY0QTJM\"," +
        "        \"aliasId\": \"TSTALIASID\"," +
        "        \"aliasName\": \"TestBotAlias\"" +
        "    }," +
        "    \"responseContentType\": \"text/plain; charset=utf-8\"," +
        "    \"proposedNextState\": {" +
        "        \"prompt\": {" +
        "            \"attempt\": \"Initial\"" +
        "        }," +
        "        \"intent\": {" +
        "            \"name\": \"ChooseLiveContent\"," +
        "            \"slots\": {}," +
        "            \"state\": \"InProgress\"," +
        "            \"confirmationState\": \"None\"" +
        "        }," +
        "        \"dialogAction\": {" +
        "            \"type\": \"ElicitSlot\"," +
        "            \"slotToElicit\": \"SoccerTeams\"" +
        "        }" +
        "    }," +
        "    \"sessionState\": {" +
        "        \"originatingRequestId\": \"04e784a6-5a24-47e5-9d22-8bc07f6b3089\"," +
        "        \"sessionAttributes\": {}," +
        "        \"intent\": {" +
        "            \"name\": \"ChooseLiveContent\"," +
        "            \"slots\": {}," +
        "            \"state\": \"InProgress\"," +
        "            \"confirmationState\": \"None\"" +
        "        }" +
        "    }," +
        "    \"messageVersion\": \"1.0\"," +
        "    \"invocationSource\": \"DialogCodeHook\"" +
        "}";

        System.out.println(jsonInputString);


        Gson myGson = new Gson();
        LambdaInput lambdaInput = myGson.fromJson(jsonInputString, LambdaInput.class);

        Search search = new Search();
        
        Context myContext = new TestContext();

        Object returnObject = search.handleRequest(lambdaInput, myContext);
        
        System.out.println(myGson.toJson(returnObject));

        System.out.println("End of execution");
    }
}