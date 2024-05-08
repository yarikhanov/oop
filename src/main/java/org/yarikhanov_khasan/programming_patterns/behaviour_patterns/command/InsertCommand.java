package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.command;

public class InsertCommand implements Command{

    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
