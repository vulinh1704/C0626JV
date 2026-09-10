package ly_thuyet;

public class Calculator {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public void sum(double a, double b, int c) {
        System.out.println(a + b + c);
    }
}
/*
Nạp chồng phương thức (Overload Method):
+ Là các phương thức xảy ra trong cùng 1 class.
+ Là các phương thức cùng tên, khác tham số truyền vào.

=> Đã từng sử dụng: Constructor
 */

class Main02 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.sum(1 , 2); // gọi 1
        cal.sum(1.0, 2.1); // gọi 2
    }
}