package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.template_method;

public class WelcomePage extends WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
