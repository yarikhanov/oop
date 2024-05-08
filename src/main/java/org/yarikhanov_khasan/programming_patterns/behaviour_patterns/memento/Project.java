package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.memento;

import java.util.Date;

public class Project {
    private String version;

    private Date date;

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        version = save.getVersion();
        date = save.getDate();
    }
}
