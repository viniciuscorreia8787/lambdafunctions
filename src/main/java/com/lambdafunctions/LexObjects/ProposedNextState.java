package com.lambdafunctions.LexObjects;

public class ProposedNextState {

    Prompt prompt;
    Intent intent;
    DialogAction dialogAction;
    
    public Prompt getPrompt() {
        return prompt;
    }
    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }
    public Intent getIntent() {
        return intent;
    }
    public void setIntent(Intent intent) {
        this.intent = intent;
    }
    public DialogAction getDialogAction() {
        return dialogAction;
    }
    public void setDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

}
