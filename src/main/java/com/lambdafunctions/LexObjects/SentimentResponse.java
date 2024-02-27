package com.lambdafunctions.LexObjects;

public class SentimentResponse {
    String sentiment;
    SentimentScore sentimentScore;
    
    public String getSentiment() {
        return sentiment;
    }
    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }
    public SentimentScore getSentimentScore() {
        return sentimentScore;
    }
    public void setSentimentScore(SentimentScore sentimentScore) {
        this.sentimentScore = sentimentScore;
    }
}
