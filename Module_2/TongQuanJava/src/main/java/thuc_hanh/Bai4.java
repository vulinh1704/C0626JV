package thuc_hanh;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int day = inputNumber.nextInt();
        switch (day) {
            case 1:
                System.out.println("Chu Nhat");
                break;
            case 2:
                System.out.println("Thu High");
                break;
            case 3:
                System.out.println("Thu Bar");
                break;
            default:
                System.out.println("Khong hop le");
        }
    }
}
