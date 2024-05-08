package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.template_method;

public abstract class WebsiteTemplate {
    public void showPage(){
            System.out.println("Header");
            showPageContent();
            System.out.println("Footer");
    }

    public abstract void showPageContent();
}
