package com.lambdafunctions;

import org.apache.commons.io.IOUtils;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

import com.google.gson.Gson;

public class Search {

    public String returnSearch(ByteArrayInputStream inputStream) throws IOException {    
        
        //String queryInput = inputStream.toString();
        String queryInput = IOUtils.toString(inputStream, StandardCharsets.UTF_8);

        Gson myGson = new Gson();
        LambdaInput lambdaInput = myGson.fromJson(queryInput, LambdaInput.class);
        
        String jsonOutputString = "{" +
                "\"messages\": [" +
                "{" +
                "\"content\": \"Conteúdos ao vivo é comigo mesmo! O campeonato Paulista começou com tudo, vou te indicar um jogo para assistir.\"," +
                "\"contentType\": \"PlainText\"" +
                "}," +
                "{" +
                "\"content\": \"Me diga qual time você gostaria de assistir hoje. [" + lambdaInput.getText() + "] \"," +
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

        LambdaOutput lambdaOutput = myGson.fromJson(jsonOutputString, LambdaOutput.class);

        lambdaOutput.setSessionId( lambdaInput.getSessionId());
        return myGson.toJson(lambdaOutput);
    }

}