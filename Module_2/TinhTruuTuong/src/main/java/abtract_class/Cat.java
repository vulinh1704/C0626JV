package abtract_class;

public class Cat extends Animal {
    String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("abtract_class.Cat eats");
    }
}
