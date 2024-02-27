package com.lambdafunctions.LexObjects;

import java.util.List;

public class Value {

    String originalValue;
    String interpretedValue;
    List<String> resolvedValues;
    
    public String getOriginalValue() {
        return originalValue;
    }
    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }
    public String getInterpretedValue() {
        return interpretedValue;
    }
    public void setInterpretedValue(String interpretedValue) {
        this.interpretedValue = interpretedValue;
    }
    public List<String> getResolvedValues() {
        return resolvedValues;
    }
    public void setResolvedValues(List<String> resolvedValues) {
        this.resolvedValues = resolvedValues;
    }

}