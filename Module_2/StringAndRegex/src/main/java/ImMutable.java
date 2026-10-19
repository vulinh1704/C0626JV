public class ImMutable {
    private String value;

    public ImMutable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class Main {
    public static void main(String[] args) {
        ImMutable i = new ImMutable("Test");
        System.out.println(i.getValue());
    }
}
