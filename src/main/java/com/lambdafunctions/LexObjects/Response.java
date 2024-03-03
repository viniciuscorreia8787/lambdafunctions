package com.lambdafunctions.LexObjects;

import java.util.List;
import java.util.Map;

public class Response {
    SessionState sessionState;
    DialogAction dialogAction;
    Intent intent;
    List<Message> messages;
    Map<String, String> requestAttributes;
    
    public SessionState getSessionState() {
        return sessionState;
    }
    public void setSessionState(SessionState sessionState) {
        this.sessionState = sessionState;
    }
    public DialogAction getDialogAction() {
        return dialogAction;
    }
    public void setDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }
    public Intent getIntent() {
        return intent;
    }
    public void setIntent(Intent intent) {
        this.intent = intent;
    }
    public List<Message> getMessages() {
        return messages;
    }
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
    public Map<String, String> getRequestAttributes() {
        return requestAttributes;
    }
    public void setRequestAttributes(Map<String, String> requestAttributes) {
        this.requestAttributes = requestAttributes;
    }



}
