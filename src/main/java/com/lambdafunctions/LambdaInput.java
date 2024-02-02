package com.lambdafunctions;

public class LambdaInput {
    private String botAliasId;
    private String botId;
    private String localeId;
    private String text;
    private String sessionId;
    
    public String getBotAliasId() {
        return botAliasId;
    }
    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }
    public String getBotId() {
        return botId;
    }
    public void setBotId(String botId) {
        this.botId = botId;
    }
    public String getLocaleId() {
        return localeId;
    }
    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getSessionId() {
        return sessionId;
    }
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }


}
