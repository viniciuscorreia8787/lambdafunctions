package com.lambdafunctions.LexObjects;

import java.util.List;
import java.util.Map;

public class Response {
    String sessionState;
    DialogAction dialogAction;
    Intent intent;
    List<Message> messages;
    Map<String, String> requestAttributes;
}
