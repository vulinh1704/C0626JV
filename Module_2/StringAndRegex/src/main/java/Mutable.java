public class Mutable {
    private String value;

    public Mutable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class MainMutable {
    public static void main(String[] args) {
        Mutable m = new Mutable("Test");
        System.out.println(m.getValue());
        m.setValue("Value");
    }
}
