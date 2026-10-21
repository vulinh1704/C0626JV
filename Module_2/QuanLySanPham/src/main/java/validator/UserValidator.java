package validator;

import lib.InputHelper;

import java.util.regex.Pattern;

public class UserValidator {
    public static String inputUsername() {
        String usernameRegex = "^[A-Za-z0-9_]{5,20}$";
        while (true) {
            String username = InputHelper.inputString();
            if (Pattern.matches(usernameRegex, username)) {
                return username;
            }
            System.out.println("Username invalid. Use 5-20 characters, only letters, numbers and underscore.");
        }
    }

    public static String inputPassword() {
        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z0-9_@#$%^&*.]{6,20}$";
        while (true) {
            String password = InputHelper.inputString();
            if (Pattern.matches(passwordRegex, password)) {
                return password;
            }
            System.out.println("Password invalid. Use 6-20 characters, include at least 1 letter and 1 number.");
        }
    }
}

