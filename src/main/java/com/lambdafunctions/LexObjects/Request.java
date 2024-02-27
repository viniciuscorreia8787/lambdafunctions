package com.lambdafunctions.LexObjects;

import java.util.List;
import java.util.Map;

public class Request {

    String inputMode;
    String sessionId;
    String inputTranscript;
    List<Interpretation> interpretations;
    Bot bot;
    String responseContentType;
    ProposedNextState proposedNextState;
    SessionState sessionState;
    String messageVersion;
    String invocationSource;
    String invocationLabel;
    Map<String, String> requestAttributes;
    List<Transcription> transcriptions;

    public Map<String, String> getRequestAttributes() {
        return requestAttributes;
    }
    public void setRequestAttributes(Map<String, String> requestAttributes) {
        this.requestAttributes = requestAttributes;
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
    public String getInvocationLabel() {
        return invocationLabel;
    }
    public void setInvocationLabel(String invocationLabel) {
        this.invocationLabel = invocationLabel;
    }
    public List<Transcription> getTranscriptions() {
        return transcriptions;
    }
    public void setTranscriptions(List<Transcription> transcriptions) {
        this.transcriptions = transcriptions;
    }
}