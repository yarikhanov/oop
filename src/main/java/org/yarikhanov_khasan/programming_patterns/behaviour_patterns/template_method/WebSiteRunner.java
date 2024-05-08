package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.template_method;

public class WebSiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        newsPage.showPage();
    }
}
