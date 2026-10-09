package service;

import java.util.List;

/*
Xây dựng 1 bộ method để các class Service có thể dễ dàng triển khai
+ CategoryService (CRUD)
+ ProductService (CRUD)
+ InvoiceService (CRUD)
=> implement chung IService
 */
public interface IService<T> {
    void add(T t);
    void delete(long id);
    void update(long id, T t);
    List<T> getAll();
    int findIndexById(long id);
    T findById(long id);
}
