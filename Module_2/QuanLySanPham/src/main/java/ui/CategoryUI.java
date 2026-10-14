package ui;

import entity.Category;
import lib.InputHelper;
import lib.errors.DataNotFoundException;
import service.CategoryService;

import java.util.List;

public class CategoryUI {
    private final static CategoryService categoryService = CategoryService.getObject();

    public static void showMainMenu() {
        int choice;
        do {
            System.out.println("====== Category Manager Menu =======");
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
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }


    public static void addUI() {
        System.out.println("====== Add Menu ======");
        long id = System.currentTimeMillis() / 1000L; // số giây
        System.out.println("Enter Category name: ");
        String name = InputHelper.inputString();
        Category newCategory = new Category(id, name);
        categoryService.add(newCategory);
    }

    public static void editUI() {
        System.out.println("====== Edit Menu ======");
        System.out.println("Enter Category update id: ");
        long id = InputHelper.inputLong();
        try {
            Category categoryFound = categoryService.findById(id);
            System.out.println("Enter Category name(old name: " + categoryFound.getCategoryName() + ")"); // Enter Category name(Old name:Cake)
            String name = InputHelper.inputString();
            categoryFound.setCategoryName(name);
            categoryService.update(id, categoryFound);
            System.out.println("Category updated!");
        } catch (DataNotFoundException e) {
            System.out.println("Category not found");
        }
    }

    public static void deleteUI() {
        System.out.println("===== Delete menu ======");
        System.out.println("Enter Category delete id: ");
        long id = InputHelper.inputLong();
        try {
            Category category = categoryService.findById(id);
            System.out.println("Do you want to delete " + category.getCategoryName() + "? (y/n)");
            String answer = InputHelper.inputString();
            if (answer.equalsIgnoreCase("y")) {
                categoryService.delete(id);
                System.out.println("Category deleted!");
            }
        } catch (DataNotFoundException e) {
            System.out.println("Category not found!");
        }
    }

    public static void getAllUI() {
        System.out.println("List Category");
        List<Category> list = categoryService.getAll();
        int count = 1;
        for (Category item : list) {
            System.out.println(count + ". Id: " + item.getCategoryId() + ", Name: " + item.getCategoryName());
            count++;
        }
    }
}
