package thuc_hanh.bai_1;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle("Tron_01", 3.4);
        Shape s2 = new Circle("Tron_02", 4);
        Shape s3 = new Rectangle("Chu_Nhat_01", 4, 10);
        Shape s4 = new Rectangle("Chu_Nhat_02", 5, 9.4);
        Shape[] shapes = {s1, s2, s3, s4};
        for (Shape item : shapes) {
            item.display();
        }
    }
}
