package default_demo_01;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("ning");
        System.out.println(student.name);
        student.showName();
    }
}
