package default_demo_01;

public class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println(name);
    }
}

// default: khi không khai báo từ khóa access modifier nào trước thuộc và phương thức
// Phạm vị: trong cùng 1 package
