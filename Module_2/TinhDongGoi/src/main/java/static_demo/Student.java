package static_demo;

public class Student {
    public static String schoolName = "CodeGym";
    private static int totalStudent = 0;
    private String name;
    double age;

    public Student(String name) {
        this.name = name;
        totalStudent = totalStudent + 1;
    }

    public static void showTotalStudent() {
        // System.out.println(this.name); // lỗi
        System.out.println("Total student: " + totalStudent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
