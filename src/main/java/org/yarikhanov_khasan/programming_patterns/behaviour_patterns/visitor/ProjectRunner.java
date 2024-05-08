package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JunDev();
        Developer senior = new SeniorDev();

        System.out.println("junior");
        project.beWritten(junior);

        System.out.println("senior");
        project.beWritten(senior);
    }
}
