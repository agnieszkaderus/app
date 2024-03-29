package com.example.App;

import static org.junit.jupiter.api.Assertions.*;
import com.example.App.service.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

public class UserServiceImplTest {

    private final UserServiceImpl userService = new UserServiceImpl();

    @Test
    public void testValidEmail() {
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("name", "John");
        requestMap.put("email", "john@example.com");
        requestMap.put("contactNumber", "123456789");
        requestMap.put("password", "password123");

        boolean isValid = userService.validateSignUpMap(requestMap);

        assertTrue(isValid);
    }

    @Test
    public void testInvalidEmail() {
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("name", "Alice");
        requestMap.put("email", "invalidemail.com");
        requestMap.put("contactNumber", "987654321");
        requestMap.put("password", "pass123");

        boolean isValid = userService.validateSignUpMap(requestMap);

        assertFalse(isValid);
    }

    @Test
    public void testEmptyEmail() {
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("name", "Bob");
        requestMap.put("email", "");
        requestMap.put("contactNumber", "777777777");
        requestMap.put("password", "password1");

        boolean isValid = userService.validateSignUpMap(requestMap);

        assertFalse(isValid);
    }

    @Test
    public void testValidPassword() {
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("name", "Mark");
        requestMap.put("email", "mark@example.com");
        requestMap.put("contactNumber", "444444444");
        requestMap.put("password", "StrongPassword123");

        boolean isValid = userService.validateSignUpMap(requestMap);

        assertTrue(isValid);
    }

    @Test
    public void testInvalidPassword() {
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("name", "Sarah");
        requestMap.put("email", "sarah@example.com");
        requestMap.put("contactNumber", "333333333");
        requestMap.put("password", "");

        boolean isValid = userService.validateSignUpMap(requestMap);

        assertFalse(isValid);
    }

    @Test
    public void testValidContactNumber() {
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("name", "Eva");
        requestMap.put("email", "eva@example.com");
        requestMap.put("contactNumber", "123456789");
        requestMap.put("password", "StrongPass123");

        boolean isValid = userService.validateSignUpMap(requestMap);

        assertTrue(isValid);
    }

    @Test
    public void testInvalidContactNumber() {
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("name", "Tom");
        requestMap.put("email", "tom@example.com");
        requestMap.put("contactNumber", "");
        requestMap.put("password", "StrongPass123");

        boolean isValid = userService.validateSignUpMap(requestMap);

        assertFalse(isValid);
    }

    @Test
    public void testNullFieldsInRequestMap() {
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("name", null);
        requestMap.put("email", null); // Pole email jako null

        boolean isValid = userService.validateSignUpMap(requestMap);

        assertFalse(isValid);
    }
}
