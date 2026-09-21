package thuc_hanh.bai_2;

public interface Payable {
    double calculatePayment();

    default void printReceipt() {
        System.out.println("Done payment: " + calculatePayment());
    }
}
