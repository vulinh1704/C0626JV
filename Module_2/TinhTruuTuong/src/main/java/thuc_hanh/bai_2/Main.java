package thuc_hanh.bai_2;

public class Main {
    public static void main(String[] args) {
        Payable invoice = new Invoice(100.00);
        Payable employee = new Employee(120, 21);
        invoice.printReceipt();
        employee.printReceipt();
    }
}
