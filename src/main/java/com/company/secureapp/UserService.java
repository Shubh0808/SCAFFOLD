package com.company.secureapp;

public class UserService {

    public boolean isValidUsername(String username) {
        return username != null && username.length() >= 3;
    }

    public String greetUser(String username) {
        if (isValidUsername(username)) {
            return "Hello, " + username + "!";
        }
        return "Invalid username!";
    }

    public int calculateDiscount(int amount) {
        if (amount >= 1000) {
            return 20; // 20% discount
        } else if (amount >= 500) {
            return 10; // 10% discount
        }
        return 0;
    }
}
