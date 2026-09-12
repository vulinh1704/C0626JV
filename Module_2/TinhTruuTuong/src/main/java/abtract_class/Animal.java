package abtract_class;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
    public abstract void eat();
}


/*
Abstract Class:
+ Có thể chứa thuộc tính và phương thức như 1 class bình thường
+ Không thể khởi tạo đối tượng (sử dụng new)
+ Có thể chứa các phương thức abstract (là các phương thức không có phần thân)
+ Khi 1 class non-abstract kế 1 class abstract sẽ phải triển khai tất cả
  phương thức abstract ở class cha.
+ final không đi được abstract
*/