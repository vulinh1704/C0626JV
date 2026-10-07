package ui;

import entity.Product;
import lib.InputHelper;
import service.ProductService;

import java.util.List;

public class ProductUI {
    private static ProductService productService = new ProductService();
    public static void showMainMenu() {
        int choice;
        do {
            System.out.println("====== Main Menu =======");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Get All");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = InputHelper.inputInt();
            switch (choice) {
                case 1:
                    addUI();
                    break;
                case 2:
                    editUI();
                    break;
                case 3:
                    deleteUI();
                    break;
                case 4:
                    getAllUI();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }

    public static void addUI() {
        System.out.println("====== Add Menu ======");
        long id = System.currentTimeMillis() / 1000L; // số giây
        System.out.println("Enter product name: ");
        String name = InputHelper.inputString();
        System.out.println("Enter product price: ");
        double price = InputHelper.inputDouble();
        Product newProduct = new Product(id, name, price);
        productService.add(newProduct);
    }

    public static void editUI() {
    }

    public static void deleteUI() {
    }

    public static void getAllUI() {
        System.out.println("List Product");
        List<Product> list = productService.getAll();
        int count = 1;
        for (Product item : list) {
            System.out.println(count + ". Id: " + item.getId() + ", Name: " + item.getName() + ", Price: " + item.getPrice());
            count++;
        }
    }
}
