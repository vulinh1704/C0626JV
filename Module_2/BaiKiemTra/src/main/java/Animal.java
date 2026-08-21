public class Animal {
    public void makeSound(){

    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is gou gou");
    }
}

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}
