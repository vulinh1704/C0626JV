import java.time.Instant;
import java.util.List;
import java.util.Scanner;

public class Main {
    ProductService productService = new ProductService();
    public Scanner inputNumber = new Scanner(System.in);
    public Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("======= My Store =======");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Remove");
            System.out.println("4. Show All");
            System.out.println("5. Search");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    showAllProducts();
                    break;
                case 0:
                    System.out.println("Goodbye!");
            }
        } while (choice != 0);
    }

    public void updateProduct() {
        System.out.println("======= Update Product =======");
        System.out.println("Enter product id: ");
        long productId = inputNumber.nextLong();
        System.out.println("Enter new product name: ");
        String name = inputString.nextLine();
        System.out.println("Enter new product price: ");
        double price = inputNumber.nextDouble();
        System.out.println("Enter new product description: ");
        String description = inputString.nextLine();
        Product newProduct = new Product(productId, name, price, description);
        productService.update(productId, newProduct);
    }

    public void removeProduct() {
        System.out.println("======== Remove Product =======");
        System.out.println("Enter product id: ");
        long productId = inputNumber.nextLong();
        productService.remove(productId);
    }

    public void showAllProducts() {
        System.out.println("====== Products List ======");
        List<Product> list = productService.findAll();
        int index = 1;
        for (Product item : list) {
            System.out.println(index + ". Id: " + item.getId() + ", Name: " + item.getName() + ", Price: " + item.getPrice());
            index++;
        }
    }

    public void addProduct() {
        System.out.println("====== Add Menu =====");
        long id = Instant.now().getEpochSecond(); // lấy id với số giây tránh trùng lặp
        System.out.println("Enter product name: ");
        String name = inputString.nextLine();
        System.out.println("Enter product price: ");
        double price = inputNumber.nextDouble();
        System.out.println("Enter product description: ");
        String description = inputString.nextLine();
        Product newProduct = new Product(id, name, price, description);
        productService.add(newProduct);
        System.out.println("Add product successful!");
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.showMainMenu();
    }
}
