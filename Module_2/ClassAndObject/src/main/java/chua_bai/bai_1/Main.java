package chua_bai.bai_1;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(6, 4);
        System.out.println("Before update: " );
        System.out.println("C = " + hinhChuNhat.tinhChuVi());
        System.out.println("S = " + hinhChuNhat.tinhDienTich());
        hinhChuNhat.chieuDai = 8;
        hinhChuNhat.chieuRong = 6;
        System.out.println("After update: " );
        System.out.println("C = " + hinhChuNhat.tinhChuVi());
        System.out.println("S = " + hinhChuNhat.tinhDienTich());
    }
}
