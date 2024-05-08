package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDevJobSite javaDevJobSite = new JavaDevJobSite();

        javaDevJobSite.addVacancy("Java Dev");
        javaDevJobSite.addVacancy("Senior Java Dev");

        Observer subscriberOne = new Subscriber("First");
        Observer subscriberTwo = new Subscriber("Second");

        javaDevJobSite.addObserver(subscriberOne);
        javaDevJobSite.addObserver(subscriberTwo);

        javaDevJobSite.addVacancy("Middle Java Dev");
    }
}
