package thuc_hanh.bai_2;

public class BenhNhan implements Comparable<BenhNhan>{
    String ten;
    boolean uuTien;

    public BenhNhan(String ten, boolean uuTien) {
        this.ten = ten;
        this.uuTien = uuTien;
    }

    @Override
    public String toString() {
        return "Ten: " + ten + ", uuTien: " + uuTien;
    }

    @Override
    public int compareTo(BenhNhan o) {
        return Boolean.compare(o.uuTien, this.uuTien);
    }
}
