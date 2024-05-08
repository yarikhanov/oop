package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.command;

public class DeleteCommand implements Command{

    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
