package service;

import entity.Product;
import lib.errors.DataNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IService<Product> {
    private List<Product> list;

    public ProductService() {
        list = new ArrayList<>();
    }

    public List<Product> findAllByContains(String keyword) {
        List<Product> listFound = new ArrayList<>();
        for (Product item : list) {
           if(item.getName().toLowerCase().contains(keyword.toLowerCase())) {
               listFound.add(item);
           }
        }
        return listFound;
    }

    @Override
    public void add(Product newProduct) {
        // check trùng
        // kiểm tra các giá trị thuộc tính
        //....
        this.list.add(newProduct);
    }

    @Override
    public void delete(long id) {
        int index = this.findIndexById(id);
        this.list.remove(index);
    }

    @Override
    public void update(long id, Product product) {
        int index = this.findIndexById(id);
        this.list.set(index, product);
    }

    @Override
    public List<Product> getAll() {
        return this.list;
    }

    @Override
    public int findIndexById(long id) {
        for (int i = 0; i < this.list.size(); i++) {
            Product product = this.list.get(i);
            if (product.getId() == id) {
                return i;
            }
        }
        throw new DataNotFoundException();
    }

    @Override
    public Product findById(long id) {
        int index = this.findIndexById(id);
        return this.list.get(index);
    }
}
