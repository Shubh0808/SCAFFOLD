package com.company.secureapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private final UserService userService = new UserService();

    @Test
    void testValidUsername() {
        assertTrue(userService.isValidUsername("abc"));
        assertFalse(userService.isValidUsername("ab"));
        assertFalse(userService.isValidUsername(null));
    }

    @Test
    void testGreetUser() {
        assertEquals("Hello, alice!", userService.greetUser("alice"));
        assertEquals("Invalid username!", userService.greetUser("a"));
    }

    @Test
    void testCalculateDiscount() {
        assertEquals(20, userService.calculateDiscount(1500));
        assertEquals(10, userService.calculateDiscount(600));
        assertEquals(0, userService.calculateDiscount(100));
    }
}
