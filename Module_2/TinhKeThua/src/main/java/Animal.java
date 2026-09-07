public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {}

    private void test() {
        System.out.println("Animal test");
    }

    public void run() {
        System.out.println("Animal run");
    }
}
