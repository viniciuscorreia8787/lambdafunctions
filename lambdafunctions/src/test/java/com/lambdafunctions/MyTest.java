package com.lambdafunctions;

public class MyTest {
    public static void main(String[] args ){
        System.out.println("Process Start!");
        Search search = new Search();
        String returnString = search.returnSearch("Minha String");
        System.out.println(returnString);
        System.out.println("End of execution");
    }
} 