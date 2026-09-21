package interface_demo;

public interface VatTheBay {
    public final static String name = "VatTheBay";
    int VAN_TOC_TRUNG_BINH = 30;
    public abstract void bay();
    void haCanh();
}

/*
interface: là 1 bản thiết thế cho các class, mô tả các tính năng
mà các class cần triển khai
+ KHÔNG PHẢI là class.
+ Sinh ra 1 kiểu dữ liệu mới.
+ Có thể chưa các hằng số static và phương thức abstract.
+ 1 class non-abstract triển khai (implements) sẽ phải triển khai tất
  phương thức có trong interface.
+ Interface cho phép các class con đa triển khai.

+ interface sẽ hỗ trợ Java trong mối quan hệ can-do.
 */
