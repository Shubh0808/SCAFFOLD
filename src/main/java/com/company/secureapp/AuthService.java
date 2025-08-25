package com.company.secureapp;

public class AuthService {

    public String normalizeUsername(String username) {
        return username == null ? "" : username.trim().toLowerCase();
    }

    public boolean isStrongPassword(String password) {
        if (password == null || password.length() < 8) return false;
        boolean hasDigit = false;
        boolean hasLetter = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) hasDigit = true;
            if (Character.isLetter(c)) hasLetter = true;
        }
        return hasDigit && hasLetter;
    }

    public boolean login(String username, String password) {
        if (username == null || password == null) return false;
        if (!isStrongPassword(password)) return false;
        return username.length() >= 3;
    }
}
