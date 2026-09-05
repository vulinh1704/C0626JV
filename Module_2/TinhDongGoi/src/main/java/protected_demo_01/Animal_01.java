package protected_demo_01;

public class Animal_01 {
    public static void main(String[] args) {
        Animal animal = new Animal("Cookie");
        System.out.println(animal.name);
        animal.showName();
    }
}
