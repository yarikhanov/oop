package org.yarikhanov_khasan.programming_patterns.structural_patterns.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDB();

        database.insert();
        database.update();
        database.select();
        database.delete();
    }
}
