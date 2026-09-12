package abtract_class;

public class Main {
    public static void main(String[] args) {
        Animal a = new Cat("Tom", "Grey");
        a.makeSound();
        System.out.println(a.getName());
    }
}
