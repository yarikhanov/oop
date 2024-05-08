package org.yarikhanov_khasan.programming_patterns.structural_patterns.proxy;

public class ProxyProject implements Project{

    private String url;

    public ProxyProject(String url) {
        this.url = url;
    }

    private RealProject project;
    @Override
    public void run() {
        if (project == null) {
            project = new RealProject(url);
        }
        project.run();
    }
}
