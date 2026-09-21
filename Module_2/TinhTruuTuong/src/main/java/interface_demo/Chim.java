package interface_demo;

// 1 class đa triển khai interface đơn kế thừa
public class Chim extends Animal implements VatTheBay, CoTheAn {
    @Override
    public void bay() {

    }

    @Override
    public void haCanh() {

    }

    @Override
    public String an() {
        return "Con chim an";
    }
}
