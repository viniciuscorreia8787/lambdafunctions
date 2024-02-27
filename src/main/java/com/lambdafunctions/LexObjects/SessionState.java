package com.lambdafunctions.LexObjects;

import java.util.List;
import java.util.Map;

public class SessionState {
    List<ActiveContext> activeContexts;
    Map<String, String> sessionAttributes;
    //RuntimeHints runtimeHints;
    DialogAction dialogAction;
    Intent intent;
    String originatingRequestId;

    public List<ActiveContext> getActiveContexts() {
        return activeContexts;
    }
    public void setActiveContexts(List<ActiveContext> activeContexts) {
        this.activeContexts = activeContexts;
    }
    public Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }
    public void setSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
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
    public String getOriginatingRequestId() {
        return originatingRequestId;
    }
    public void setOriginatingRequestId(String originatingRequestId) {
        this.originatingRequestId = originatingRequestId;
    }
}
