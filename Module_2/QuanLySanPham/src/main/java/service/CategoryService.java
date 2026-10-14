package service;

import entity.Category;
import lib.errors.DataNotFoundException;
import repository.CategoryRepository;

import java.util.List;

public class CategoryService implements IService<Category> {
    private CategoryRepository categoryRepository = new CategoryRepository();
    private List<Category> list;
    private static final CategoryService categoryService = new CategoryService();

    private CategoryService() {
        list = categoryRepository.read(); // đọc dữ liệu từ File
    }

    public static CategoryService getObject() {
         return categoryService;
    }

    @Override
    public void add(Category newCategory) {
        this.list.add(newCategory);
        this.categoryRepository.write(list);
    }

    @Override
    public void delete(long id) {
        int index = this.findIndexById(id);
        this.list.remove(index);
        this.categoryRepository.write(list);
    }

    @Override
    public void update(long id, Category Category) {
        int index = this.findIndexById(id);
        this.list.set(index, Category);
        this.categoryRepository.write(list);
    }

    @Override
    public List<Category> getAll() {
        return this.list;
    }

    @Override
    public int findIndexById(long id) {
        for (int i = 0; i < this.list.size(); i++) {
            Category category = this.list.get(i);
            if (category.getCategoryId() == id) {
                return i;
            }
        }
        throw new DataNotFoundException();
    }

    @Override
    public Category findById(long id) {
        int index = this.findIndexById(id);
        return this.list.get(index);
    }
}
