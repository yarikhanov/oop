package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.template_method;

public class NewsPage extends WebsiteTemplate{
    public void showPage(){
        System.out.println("Header");
        System.out.println("News");
        System.out.println("Footer");
    }

    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
