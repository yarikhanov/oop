package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.command;

public class Developer {
    Command insert;
    Command update;
    Command select;
    Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertRec(){
        insert.execute();
    }

    public void updateRec(){
        update.execute();
    }

    public void selectRec(){
        select.execute();
    }

    public void deleteRec(){
        delete.execute();
    }
}
