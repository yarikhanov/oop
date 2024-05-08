package org.yarikhanov_khasan.programming_patterns.structural_patterns.proxy;

public class RealProject implements Project{

    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading project " + url);
    }
    @Override
    public void run() {
        System.out.println("Running project " + url);
    }
}
