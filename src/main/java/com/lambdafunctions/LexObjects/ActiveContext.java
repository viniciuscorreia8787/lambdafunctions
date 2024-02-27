package com.lambdafunctions.LexObjects;
import java.util.Map;

public class ActiveContext {
    String name;
    Map<String, String> contextAttributes;
    TimeToLive timeToLive;
    Map<String, String> sessionAttributes;

    public Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }
    public void setSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }
    public TimeToLive getTimeToLive() {
        return timeToLive;
    }
    public void setTimeToLive(TimeToLive timeToLive) {
        this.timeToLive = timeToLive;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Map<String, String> getContextAttributes() {
        return contextAttributes;
    }
    public void setContextAttributes(Map<String, String> contextAttributes) {
        this.contextAttributes = contextAttributes;
    }
}
