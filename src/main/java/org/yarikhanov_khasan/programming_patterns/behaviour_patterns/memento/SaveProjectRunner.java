package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();

        System.out.println("Create version 1.6");
        project.setVersionAndDate("1.6");

        System.out.println(project);

        System.out.println("Save gitHub");
        gitHubRepo.setSave(project.save());

        System.out.println("Updating to 1.7");
        project.setVersionAndDate("1.7");

        System.out.println(project);

        System.out.println("Rollback");

        project.load(gitHubRepo.getSave());
        System.out.println(project);
    }
}
