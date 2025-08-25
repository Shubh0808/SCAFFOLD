package com.company.secureapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthServiceTest {

    private final AuthService authService = new AuthService();

    @Test
    void testNormalizeUsername() {
        assertEquals("john", authService.normalizeUsername(" John "));
        assertEquals("", authService.normalizeUsername(null));
    }

    @Test
    void testStrongPassword() {
        assertTrue(authService.isStrongPassword("Abcd1234"));
        assertFalse(authService.isStrongPassword("short"));
        assertFalse(authService.isStrongPassword("NoDigitsHere"));
    }

    @Test
    void testLogin() {
        assertTrue(authService.login("john", "Pass1234"));
        assertFalse(authService.login("jo", "Pass1234"));  // too short username
        assertFalse(authService.login("john", "weak"));    // weak password
    }
}
