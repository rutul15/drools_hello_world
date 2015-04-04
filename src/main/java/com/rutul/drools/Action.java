package com.rutul.drools;

public class Action {
    public void performAction(Message message) {
    	System.out.println("Action perform from Action.java");
        message.printMessage();
    }
}