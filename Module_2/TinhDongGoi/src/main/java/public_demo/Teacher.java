package public_demo;

public class Teacher {
    public String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println(name);
    }
}

/*
public class Teacher02 { // lỗi
}
*/

/*
 public: là từ khóa access modifier cho phép truy cập thuộc tính
 và phương thức ở bất cứ đâu trong dự án.

 Ghi chú:
 public đi với class: đang cho phép class khác có thể sử dụng
 class đó. Trong 1 file java có thể khai báo nhiều class trong
 cùng 1 file nhưng chỉ cho phép public class cùng tên file.
*/
