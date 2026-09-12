package interface_demo;

public class MayBay implements VatTheBay {

    @Override
    public void bay() {
        System.out.println("May bay bay");
    }

    @Override
    public void haCanh() {
        System.out.println("May bay ha canh");
    }
}
