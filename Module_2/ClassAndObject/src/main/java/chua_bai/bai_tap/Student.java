package chua_bai.bai_tap;

public class Student {
    /*
     Các thuộc tính sẽ có giá trị mặc định nếu không set giá trị
     thì giá trị mặc sẽ tương ứng với kiểu dữ liệu:
     String-null, int-0, double: 0.0, boolean-false
     */
    public String name;
    public double score;
    public String gender = "Other";

    Student(String name, double score, String gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    void study() {
        System.out.println(this.name + " is studying");
    }

    void play() {
        System.out.println(this.name + " is playing");
    }
}

/*
Xây dựng 1 class Student có thuộc tính name, score và gender
và các phương thức void study, void play (in ra <tên> + <hành động tương ứng>)
Ví dụ khi 1 đối tượng name là Ning gọi study sẽ in ra "Ning is studying";
=> Tạo 3 đối tượng từ Student và in ra name + score. Sau đó gọi các phương thức của chúng.
 */