package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.mediator;

public class SimpleCharRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User userOne = new SimpleUser(chat, "UserOne");
        User userTwo = new SimpleUser(chat, "UserTwo");

        chat.setAdmin(admin);
        chat.addUserToChar(userOne);
        chat.addUserToChar(userTwo);

        userOne.sendMessage("One");
    }
}
