package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.iterator;

public class JavaDevRunner {
    public static void main(String[] args) {
        String [] skills = {"java", "spring", "hibernate"};

        JavaDev javaDev = new JavaDev("Name", skills);

        Iterator iterator = javaDev.getIterator();

        System.out.println(javaDev.getName());
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
