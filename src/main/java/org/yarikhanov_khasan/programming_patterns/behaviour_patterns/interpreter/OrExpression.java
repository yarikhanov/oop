package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.interpreter;

public class OrExpression implements Expression{

    Expression expressionOne;
    Expression expressionTwo;

    public OrExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    @Override
    public boolean intrepret(String context) {
        return expressionOne.intrepret(context) || expressionTwo.intrepret(context);
    }
}
