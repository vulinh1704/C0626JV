package ui;

import lib.InputHelper;

public class MainUI {
    public static void showMainMenu() {
        int choice;
        do {
            System.out.println("====== NING STORE =======");
            System.out.println("1. Manager Category");
            System.out.println("2. Manager Product");
            System.out.println("3. Manager User"); // thêm, sửa, xóa, chặn
            System.out.println("0. Logout");
            System.out.println("Enter your choice: ");
            choice = InputHelper.inputInt();
            switch (choice) {
                case 1:
                    CategoryUI.showMainMenu();
                    break;
                case 2:
                    ProductUI.showMainMenu();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }
}
