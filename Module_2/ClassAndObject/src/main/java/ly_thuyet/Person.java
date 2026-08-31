package ly_thuyet;

// class: là 1 bản mô tả cho các đối tượng
public class Person {
    /*
    thuộc tính: khai báo trong class, là đặc điểm (dữ liệu) của các đối tượng
    */
    public String name;
    public int age;

    /*
    constructor: Hàm tạo là nơi thực hiện nhận dữ liệu và sinh ra các đối tượng cụ thể
    + constructor là hàm trùng tren với class
    + có thể có nhiều hàm tạo (khác nhau tham số truyền vào)
    + Sẽ được gọi khi tạo đối tượng (tạo qua từ khóa new)
     */
    Person(String nameInput, int ageInput) {
        // this: đai diện cho đối tượng được sinh ra
        this.name = nameInput;
        this.age = ageInput;
    }

    // Các phương thức(method): Là những hành động mà các đối tượng có thể thực hiện
    public void drive() {
        // this: đại diện cho đối tượng đang sử dụng phương thức
        System.out.println(this.name + " is driving");
    }

    public boolean pay() {
        return true;
    }
}
