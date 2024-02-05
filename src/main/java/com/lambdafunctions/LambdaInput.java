package com.lambdafunctions;

import java.util.List;
import java.util.Map;

public class LambdaInput {
    public String inputMode;
    public String sessionId;
    public String inputTranscript;
    public List<Interpretation> interpretations;
    public Bot bot;
    public String responseContentType;
    public ProposedNextState proposedNextState;
    public SessionState sessionState;
    public String messageVersion;
    public String invocationSource;

    public static class Intent {
        public String name;
        public Map<String, Object> slots;
        public String state;
        public String confirmationState;
    }

    public static class Interpretation {
        public String interpretationSource;
        public Double nluConfidence;
        public Intent intent;
    }

    public static class Bot {
        public String name;
        public String version;
        public String localeId;
        public String id;
        public String aliasId;
        public String aliasName;
    }

    public static class Prompt {
        public String attempt;
    }

    public static class DialogAction {
        public String type;
        public String slotToElicit;
    }

    public static class ProposedNextState {
        public Prompt prompt;
        public Intent intent;
        public DialogAction dialogAction;
    }

    public static class SessionState {
        public String originatingRequestId;
        public Map<String, Object> sessionAttributes;
        public Intent intent;
    }

    public String getInputMode() {
        return inputMode;
    }

    public void setInputMode(String inputMode) {
        this.inputMode = inputMode;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getInputTranscript() {
        return inputTranscript;
    }

    public void setInputTranscript(String inputTranscript) {
        this.inputTranscript = inputTranscript;
    }

    public List<Interpretation> getInterpretations() {
        return interpretations;
    }

    public void setInterpretations(List<Interpretation> interpretations) {
        this.interpretations = interpretations;
    }

    public Bot getBot() {
        return bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public String getResponseContentType() {
        return responseContentType;
    }

    public void setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
    }

    public ProposedNextState getProposedNextState() {
        return proposedNextState;
    }

    public void setProposedNextState(ProposedNextState proposedNextState) {
        this.proposedNextState = proposedNextState;
    }

    public SessionState getSessionState() {
        return sessionState;
    }

    public void setSessionState(SessionState sessionState) {
        this.sessionState = sessionState;
    }

    public String getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    public String getInvocationSource() {
        return invocationSource;
    }

    public void setInvocationSource(String invocationSource) {
        this.invocationSource = invocationSource;
    }
}
