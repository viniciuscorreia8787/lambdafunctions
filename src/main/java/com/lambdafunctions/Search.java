package com.lambdafunctions;

import com.google.gson.Gson;

public class Search {

    public String returnSearch(String queryInput){
        Gson myGson = new Gson();
        LambdaInput lambdaInput = myGson.fromJson(queryInput, LambdaInput.class);


        return myGson.toJson(lambdaInput.toString());
    }

}
