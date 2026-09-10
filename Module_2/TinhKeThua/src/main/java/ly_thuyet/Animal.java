package ly_thuyet;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {}

    private void test() {
        System.out.println("ly_thuyet.Animal test");
    }

    public void run() {
        System.out.println("ly_thuyet.Animal run");
    }
}
