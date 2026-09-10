package thuc_hanh.bai_2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ning", 3);
        Employee man_01 = new Manager("Duong", 8, 8);
        System.out.println(employee.calculateSalary());
        System.out.println(man_01.calculateSalary());
        Manager man_02 = (Manager) man_01; // ép: down casting
        System.out.println(man_02.getBonus());
    }
}
