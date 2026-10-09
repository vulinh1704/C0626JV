package ui;

import entity.Product;
import lib.InputHelper;
import lib.errors.DataNotFoundException;
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
            System.out.println("5. Search by name");
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
                case 5:
                    searchByNameUI();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }

    public static void searchByNameUI() {
        System.out.println("===== Search Products ======");
        System.out.println("Enter keyword: ");
        String keyword = InputHelper.inputString();
        List<Product> list = productService.findAllByContains(keyword);
        int count = 1;
        for (Product item : list) {
            System.out.println(count + ". Id: " + item.getId() + ", Name: " + item.getName() + ", Price: " + item.getPrice());
            count++;
        }
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
        System.out.println("====== Edit Menu ======");
        System.out.println("Enter product update id: ");
        long id = InputHelper.inputLong();
        try {
            Product productFound = productService.findById(id);
            System.out.println("Enter product name(old name: " + productFound.getName() + ")"); // Enter product name(Old name:Cake)
            String name = InputHelper.inputString();
            System.out.println("Enter product price(old price: " + productFound.getPrice() + ")");
            double price = InputHelper.inputDouble();
            productFound.setName(name);
            productFound.setPrice(price);
            productService.update(id, productFound);
            System.out.println("Product updated!");
        } catch (DataNotFoundException e) {
            System.out.println("Product not found");
        }
    }

    public static void deleteUI() {
        System.out.println("===== Delete menu ======");
        System.out.println("Enter product delete id: ");
        long id = InputHelper.inputLong();
        try {
            Product product = productService.findById(id);
            System.out.println("Do you want to delete " + product.getName() + "? (y/n)");
            String answer = InputHelper.inputString();
            if (answer.equalsIgnoreCase("y")) {
                productService.delete(id);
                System.out.println("Product deleted!");
            }
        } catch (DataNotFoundException e) {
            System.out.println("Product not found!");
        }
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
