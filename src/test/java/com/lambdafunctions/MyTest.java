package com.lambdafunctions;

import com.google.gson.Gson;

public class MyTest {

    public static void main(String[] args) {
        /***
        System.out.println("Process Start!");
        Search search = new Search();
        String returnString = search.returnSearch("Minha String");
        System.out.println(returnString);
        System.out.println("End of execution");
        ***/
        
        // Create Input JSon
        String jsonInputString = "{" +
                "   \"botAliasId\": \"TSTALIASID\"," +
                "   \"botId\": \"QDSXY0QTJM\"," +
                "   \"localeId\": \"pt_BR\"," +
                "   \"text\": \"O que ta passando na TV hoje?\"," +
                "   \"sessionId\": \"851725315467669\"" +
                "}";

        String jsonOutputString = "{" +
                "\"messages\": [" +
                "{" +
                "\"content\": \"Conteúdos ao vivo é comigo mesmo! O campeonato Paulista começou com tudo, vou te indicar um jogo para assistir.\"," +
                "\"contentType\": \"PlainText\"" +
                "}," +
                "{" +
                "\"content\": \"Me diga qual time você gostaria de assistir hoje.\"," +
                "\"contentType\": \"PlainText\"" +
                "}" +
                "]," +
                "\"sessionState\": {" +
                "\"dialogAction\": {" +
                "\"type\": \"ElicitSlot\"," +
                "\"slotToElicit\": \"SoccerTeams\"" +
                "}," +
                "\"intent\": {" +
                "\"name\": \"ChooseLiveContent\"," +
                "\"slots\": {" +
                "\"SoccerTeams\": null" +
                "}," +
                "\"state\": \"InProgress\"," +
                "\"confirmationState\": \"None\"" +
                "}," +
                "\"sessionAttributes\": {}," +
                "\"originatingRequestId\": \"98fe3055-ac3b-4a4f-b5e7-8833f5ec5d2f\"" +
                "}," +
                "\"interpretations\": [" +
                "{" +
                "\"nluConfidence\": {" +
                "\"score\": 0.73" +
                "}," +
                "\"intent\": {" +
                "\"name\": \"ChooseLiveContent\"," +
                "\"slots\": {" +
                "\"SoccerTeams\": null" +
                "}," +
                "\"state\": \"InProgress\"," +
                "\"confirmationState\": \"None\"" +
                "}," +
                "\"interpretationSource\": \"Lex\"" +
                "}," +
                "{" +
                "\"intent\": {" +
                "\"name\": \"FallbackIntent\"," +
                "\"slots\": {}" +
                "}," +
                "\"interpretationSource\": \"Lex\"" +
                "}," +
                "{" +
                "\"nluConfidence\": {" +
                "\"score\": 0.63" +
                "}," +
                "\"intent\": {" +
                "\"name\": \"Greetings\"," +
                "\"slots\": {" +
                "\"ClientName\": {" +
                "\"value\": {" +
                "\"originalValue\": \"Vinicius\"," +
                "\"interpretedValue\": \"Vinicius\"," +
                "\"resolvedValues\": []" +
                "}" +
                "}" +
                "}" +
                "}," +
                "\"interpretationSource\": \"Lex\"" +
                "}," +
                "{" +
                "\"nluConfidence\": {" +
                "\"score\": 0.33" +
                "}," +
                "\"intent\": {" +
                "\"name\": \"OrderFlowers\"," +
                "\"slots\": {" +
                "\"FlowerType\": null," +
                "\"PickupDate\": null," +
                "\"PickupTime\": null" +
                "}" +
                "}," +
                "\"interpretationSource\": \"Lex\"" +
                "}" +
                "]," +
                "\"sessionId\": \"851725315467669\"" +
                "}";

        Gson myGson = new Gson();
        LambdaOutput lambdaOutput = myGson.fromJson(jsonOutputString, LambdaOutput.class);

    }
}