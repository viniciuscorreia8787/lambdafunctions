package com.lambdafunctions;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MyTest {

    public static void main(String[] args) throws IOException {

        // Create Input JSon
        String jsonInputString = "{" +
                "   \"botAliasId\": \"TSTALIASID\"," +
                "   \"botId\": \"QDSXY0QTJM\"," +
                "   \"localeId\": \"pt_BR\"," +
                "   \"text\": \"O que ta passando na TV hoje meu amigo?\"," +
                "   \"sessionId\": \"851725315467669\"" +
                "}";


        ByteArrayInputStream inputStream = new ByteArrayInputStream(jsonInputString.getBytes());

        System.out.println("Process Start!");
        Search search = new Search();
        String returnString = search.returnSearch(inputStream);
        System.out.println(returnString);
        System.out.println("End of execution");
    }
}