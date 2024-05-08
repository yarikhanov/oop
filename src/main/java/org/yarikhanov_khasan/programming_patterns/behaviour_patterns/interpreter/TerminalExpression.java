package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.interpreter;

public class TerminalExpression implements Expression{

    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean intrepret(String context) {
        return context.contains(data);
    }
}
