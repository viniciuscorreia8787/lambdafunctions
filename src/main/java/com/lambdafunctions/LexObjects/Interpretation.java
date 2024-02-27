package com.lambdafunctions.LexObjects;

public class Interpretation {
    String interpretationSource;
    Double nluConfidence;
    Intent intent;
    SentimentResponse sentimentResponse;

    public String getInterpretationSource() {
        return interpretationSource;
    }
    public void setInterpretationSource(String interpretationSource) {
        this.interpretationSource = interpretationSource;
    }
    public Double getNluConfidence() {
        return nluConfidence;
    }
    public void setNluConfidence(Double nluConfidence) {
        this.nluConfidence = nluConfidence;
    }
    public Intent getIntent() {
        return intent;
    }
    public void setIntent(Intent intent) {
        this.intent = intent;
    }
    public SentimentResponse getSentimentResponse() {
        return sentimentResponse;
    }
    public void setSentimentResponse(SentimentResponse sentimentResponse) {
        this.sentimentResponse = sentimentResponse;
    }
}
