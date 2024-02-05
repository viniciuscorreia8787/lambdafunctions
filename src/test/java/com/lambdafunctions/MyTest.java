package com.lambdafunctions;

//import java.io.ByteArrayInputStream;
//import javax.swing.text.AbstractDocument.Content;
//import java.io.IOException;

import com.amazonaws.services.lambda.runtime.Context;
import com.google.gson.Gson;

public class MyTest {

    public static void main(String[] args){

        System.out.println("Process Start!");

        // Create Input JSon
        String jsonInputString = "{" +
                "   \"botAliasId\": \"TSTALIASID\"," +
                "   \"botId\": \"QDSXY0QTJM\"," +
                "   \"localeId\": \"pt_BR\"," +
                "   \"text\": \"O que ta passando na TV hoje meu amigo?\"," +
                "   \"sessionId\": \"851725315467669\"" +
                "}";
        //ByteArrayInputStream inputStream = new ByteArrayInputStream(jsonInputString.getBytes());
        Gson myGson = new Gson();
        LambdaInput lambdaInput = myGson.fromJson(jsonInputString, LambdaInput.class);

        Search search = new Search();
        
        //String returnString = search.returnSearch(inputStream);

        Context myContext = new TestContext();

        Object returnObject = search.handleRequest(lambdaInput, myContext);
        
        System.out.println(myGson.toJson(returnObject));

        System.out.println("End of execution");
    }
}