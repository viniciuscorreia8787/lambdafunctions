package com.lambdafunctions.LexObjects;

import java.util.Map;

public class Intent {
    String name;
    Map<String, Object> slots;
    String state;
    String confirmationState;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getConfirmationState() {
        return confirmationState;
    }
    public void setConfirmationState(String confirmationState) {
        this.confirmationState = confirmationState;
    }

    public Map<String, Object> getSlots() {
        return slots;
    }
    public void setSlots(Map<String, Object> slots) {
        this.slots = slots;
    }
}
