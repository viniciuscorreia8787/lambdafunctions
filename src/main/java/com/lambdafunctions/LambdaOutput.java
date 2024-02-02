package com.lambdafunctions;
import java.util.List;


public class LambdaOutput {

    private List<Message> messages;
    private SessionState sessionState;
    private List<Interpretation> interpretations;
    private String sessionId;

    // Construtores, getters e setters podem ser adicionados conforme necessário

    public static class Message {
        private String content;
        private String contentType;

        // Construtores, getters e setters podem ser adicionados conforme necessário
    }

    public static class SessionState {
        private DialogAction dialogAction;
        private Intent intent;
        private SessionAttributes sessionAttributes;
        private String originatingRequestId;

        // Construtores, getters e setters podem ser adicionados conforme necessário
    }

    public static class DialogAction {
        private String type;
        private String slotToElicit;

        // Construtores, getters e setters podem ser adicionados conforme necessário
    }

    public static class Intent {
        private String name;
        private Slots slots;
        private String state;
        private String confirmationState;

        // Construtores, getters e setters podem ser adicionados conforme necessário
    }

    public static class Slots {
        private String soccerTeams;

        // Construtores, getters e setters podem ser adicionados conforme necessário
    }

    public static class SessionAttributes {
        // Pode ser estendido conforme necessário
    }

    public static class Interpretation {
        private NluConfidence nluConfidence;
        private Intent intent;
        private String interpretationSource;

        // Construtores, getters e setters podem ser adicionados conforme necessário
    }

    public static class NluConfidence {
        private double score;

        // Construtores, getters e setters podem ser adicionados conforme necessário
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public SessionState getSessionState() {
        return sessionState;
    }

    public void setSessionState(SessionState sessionState) {
        this.sessionState = sessionState;
    }

    public List<Interpretation> getInterpretations() {
        return interpretations;
    }

    public void setInterpretations(List<Interpretation> interpretations) {
        this.interpretations = interpretations;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}