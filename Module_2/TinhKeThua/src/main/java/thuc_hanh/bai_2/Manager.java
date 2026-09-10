package thuc_hanh.bai_2;

public class Manager extends Employee {
    private double bonus;


    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        double baseSal = super.calculateSalary();
        return baseSal + bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
