package ui;

import entity.User;
import lib.InputHelper;
import lib.errors.UserIsExist;
import service.UserService;
import validator.UserValidator;

public class AuthUI {
    private static final UserService userService = UserService.getObject();

    public static void showMainMenu() {
        int choice;
        do {
            System.out.println("====== NING STORE =======");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = InputHelper.inputInt();
            switch (choice) {
                case 1:
                    registerUI();
                    break;
                case 2:
                    loginUI();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }

    public static void registerUI() {
        System.out.println("=========== Register Form ==========");
        Long id = System.currentTimeMillis() / 1000L;
        System.out.println("Enter username: ");
        String username = UserValidator.inputUsername();
        System.out.println("Enter password: ");
        String password = UserValidator.inputPassword();
        User newUser = new User(id, username, password);
        try {
            userService.register(newUser);
            System.out.println("Register successfully!");
        } catch (UserIsExist e) {
            System.out.println("User is exist!");
        }
    }

    public static void loginUI() {
        System.out.println("=========== Login Form ==========");
        System.out.println("Enter username: ");
        String username = UserValidator.inputUsername();
        System.out.println("Enter password: ");
        String password = UserValidator.inputPassword();
        boolean isUser = userService.login(username, password);
        if (isUser) {
            System.out.println("Login successfully!");
            MainUI.showMainMenu();
        } else {
            System.out.println("Wrong username or password");
        }
    }
}
