package static_demo;

public class Main {
    public static void main(String[] args) {
        // System.out.println(Student.name);
        /*
         Khởi tạo đối tượng mới truy cập được thuộc tính và
         phương thức => Biến và phương thức của đối tương (new)
          Student s = new Student("Ning");
        System.out.println(s.getName());
        System.out.println(s.age);
        System.out.println(s.schoolName);
         */

        /*
        Với những thuộc tính và phương thức của class (là thành phần
        dùng chung cho tất cả đôí tượng) thì thêm từ khóa static.
        + Có thể sử dụng tên lớp để truy cập các thành phần đó.
        + Method static không thể gọi các thành phần non-static
         */
        System.out.println("School name of all students: " + Student.schoolName);
        Student s1 = new Student("Ning");
        Student s2 = new Student("Ning");
        Student.showTotalStudent();
        Student s3 = new Student("Ning");
        Student.showTotalStudent();
    }
}
