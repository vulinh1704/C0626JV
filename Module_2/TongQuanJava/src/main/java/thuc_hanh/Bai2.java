package thuc_hanh;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhap 1 so: ");
        int number = inputNumber.nextInt();
        if(number % 2 == 0) {
            System.out.println("So chan");
        } else {
            System.out.println("So le");
        }
    }
}
