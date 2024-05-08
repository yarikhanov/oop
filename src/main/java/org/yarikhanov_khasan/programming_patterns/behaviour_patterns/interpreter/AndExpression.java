package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.interpreter;

public class AndExpression implements Expression{
    Expression expressionOne;

    Expression expressionTwo;

    public AndExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    @Override
    public boolean intrepret(String context) {
        return expressionOne.intrepret(context) && expressionTwo.intrepret(context);
    }
}
