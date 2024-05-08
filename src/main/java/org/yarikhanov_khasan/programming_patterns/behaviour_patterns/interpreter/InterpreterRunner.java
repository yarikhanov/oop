package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {

        Expression isJava = getJavaExpression();

        Expression isJavaEEDev = getJavaEEExpression();

        System.out.println(isJava.intrepret("java core"));
        System.out.println(isJavaEEDev.intrepret("java spring"));

    }

    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("java");

        Expression javaCore = new TerminalExpression("java core");

        return new OrExpression(java, javaCore);
    }


    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("java");
        Expression spring = new TerminalExpression("spring");

        return new AndExpression(java, spring);
    }

}
