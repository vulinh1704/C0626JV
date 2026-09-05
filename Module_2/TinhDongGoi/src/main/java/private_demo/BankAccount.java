package private_demo;

public class BankAccount {
    private double balance;
    private int userID;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            return;
        }
        this.balance = balance;
    }

    private void resetForTesting() { // 📝 chỉ định dùng nội bộ lúc test
        balance = 0;
    }

}

/*
 private: là 1 từ access modifier với quy định phạm vi truy cập
 của THUỘC TÍNH và PHƯƠNG THỨC chỉ trong cùng 1 class.

 Khi nào nên sử dụng private:
 + với thuộc tính: luôn sử dụng private, muốn lấy ra và sửa thì sẽ thông qua
 các phương thức public get/set.
 + với phương thức/ constructor: tùy trường hợp
 */
