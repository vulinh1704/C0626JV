package ly_thuyet;

public class Main {
    public static void main(String[] args) {
        // đối tượng: các thực thể cụ thể được sinh ra từ lớp.
        Person p = new Person("Ning", 21);
        Person p2 = new Person("Duong", 22);
        Person p3 = new Person("Dat", 22);

        p.name = "Vu Ning"; // gán lại giá trị cho thuộc tính
        System.out.println(p.name); // truy xuất thuộc tính
        p.drive(); // truy xất phương thức
        p2.drive();
    }
}

