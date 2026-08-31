package chua_bai;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ning", 10, "Nam");
        Student s2 = new Student("Duong", 10, "Nam");
        Student s3 = new Student("Linh", 10);

        System.out.println("Name: " + s1.name + "; Score: " + s1.score);
        s1.play();
        s1.study();
        s2.study();
        System.out.println("S3 gender is: " + s3.gender);
    }
}
