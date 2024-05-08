package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.command;

public class SelectCommand implements Command{

    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
