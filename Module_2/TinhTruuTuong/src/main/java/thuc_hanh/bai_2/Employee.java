package thuc_hanh.bai_2;

public class Employee implements Payable {
    private int hoursWorked;
    private double hourlyRate;

    public Employee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePayment() {
        return this.hoursWorked * this.hoursWorked;
    }
}
