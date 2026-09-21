package thuc_hanh.bai_2;

public class Invoice implements Payable {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        return amount;
    }
}
