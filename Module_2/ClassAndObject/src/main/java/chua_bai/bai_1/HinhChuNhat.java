package chua_bai.bai_1;

public class HinhChuNhat {
    int chieuDai;
    int chieuRong;

    HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    int tinhDienTich() {
        return chieuDai * chieuRong;
    }

    int tinhChuVi(){
        return (chieuDai + chieuRong) * 2;
    }
}
