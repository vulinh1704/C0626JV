package protected_demo_02;

import protected_demo_01.Animal;

public class Dog extends Animal {

    protected Dog(String name) {
        super(name);
    }

    public void showNamDog() {
        System.out.println(this.name);
        this.showName();
    }
}
