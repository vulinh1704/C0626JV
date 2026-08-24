public class Demo {
    public static void main(String[] args) {
        /*
        // Kiểu tham trị
        int number_01 = 1;
        int number_02 = number_01;
        number_01 = 10;
        System.out.println("number_01 = " + number_01); // 10
        System.out.println("number_02 = "  + number_02); // 1
         */

        // Kiểu tham chiếu: Kiểu Object, Array
        Student student_01 = new Student("Ning", 18);
        Student student_02 = student_01;
        Student student_03 = new Student("Ning", 18);
        student_01.name = "Vu Linh";
        System.out.println(student_03 == student_01);
        System.out.println("Student name 01: " + student_01.name);
        System.out.println("Student name 02: " + student_02.name);
    }
}
