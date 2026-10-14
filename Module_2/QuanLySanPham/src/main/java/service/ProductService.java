package service;

import entity.Product;
import lib.errors.DataNotFoundException;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IService<Product> {
    private ProductRepository productRepository = new ProductRepository();
    private List<Product> list;
    private final static ProductService productService = new ProductService();

    private ProductService() {
        list = productRepository.read(); // đọc dữ liệu từ File
    }

    public static ProductService getObject() {
        return productService;
    }

    public List<Product> findAllByContains(String keyword) {
        List<Product> listFound = new ArrayList<>();
        for (Product item : list) {
            if (item.getName().toLowerCase().contains(keyword.toLowerCase())) {
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
        this.productRepository.write(list);
    }

    @Override
    public void delete(long id) {
        int index = this.findIndexById(id);
        this.list.remove(index);
        this.productRepository.write(list);
    }

    @Override
    public void update(long id, Product product) {
        int index = this.findIndexById(id);
        this.list.set(index, product);
        this.productRepository.write(list);
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
//                System.out.println("[ProductService.findIndexById.product]" + product.getId() + "," + product.getName());
//                System.out.println("ProductService.findIndexById.id" + id);
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

/*
 Cách Debug
 -> Focus vào tính năng
 -> Đặt log của các biến trong các method của tính năng đó
*/

/*
Cursor, Github Copilot, Claude, Codex
*/

/*
Luyện tập cách debug
Áp dụng đọc ghi file vào dự án.
 */