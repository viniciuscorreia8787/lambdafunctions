package com.lambdafunctions.LexObjects;

public class Transcription {
        String transcription;
        Double transcriptionConfidence;
        ResolvedContext resolvedContext;
        //ResolvedSlots resolvedSlots;
        
        public String getTranscription() {
                return transcription;
        }
        public void setTranscription(String transcription) {
                this.transcription = transcription;
        }
        public Double getTranscriptionConfidence() {
                return transcriptionConfidence;
        }
        public void setTranscriptionConfidence(Double transcriptionConfidence) {
                this.transcriptionConfidence = transcriptionConfidence;
        }
        public ResolvedContext getResolvedContext() {
                return resolvedContext;
        }
        public void setResolvedContext(ResolvedContext resolvedContext) {
                this.resolvedContext = resolvedContext;
        }
}
