public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Cun");
        System.out.println(dog.name);
        dog.run();
        // dog.test(); lỗi
        dog.bark();
    }
}

/*
+ Để kế thừa trong java sẽ sử dụng từ khóa extends.
+ Class con có thế kế thừa thuộc tính và phương thức mà class cha cho phép (Phụ thuộc Access Modifier)
+ Class con có thể khai báo thêm thuộc tính và phương thức mới.
+ Class con chỉ có gọi constructor của lớp cha.
+ Java chỉ hỗ trợ đơn kế thừa.
*/