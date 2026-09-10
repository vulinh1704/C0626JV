package thuc_hanh.bai_1;

public class Main {
    public static void main(String[] args) {
        Animal dog_01 = new Dog("Muc");
        Animal dog_02 = new Dog("Bach");
        Animal cat_01 = new Cat("Tom");
        Animal cat_02 = new Cat("Meo Muop");
        Animal[] animals = {dog_01, dog_02, cat_01, cat_02};
        for (Animal item : animals) {
            item.makeSound();
        }
    }
}
