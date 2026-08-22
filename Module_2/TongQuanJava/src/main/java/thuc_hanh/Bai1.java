package thuc_hanh;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double chieuDai = inputNumber.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double chieuRong = inputNumber.nextDouble();
        double dienTich = chieuRong * chieuRong;
        double chuVi = (chieuDai + chieuRong) * 2;
        System.out.println("S = " + dienTich + ";C = " + chuVi);
    }
}
