package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRec();
        developer.updateRec();
        developer.selectRec();
        developer.deleteRec();
    }
}
