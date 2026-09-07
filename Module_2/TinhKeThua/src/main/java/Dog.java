public class Dog extends Animal {
    int age;

    public Dog(String name) {
        super(name);
        /*
        super: gọi constructor có tham số tương ứng của class cha,
        có nhiệm vụ load các thành phần lớp cha cho phép kế thừa.
        */
    }

    public void bark() {
        System.out.println(super.name + " Bark");
        /*
        super vị trí này: truy cập đến thuộc tính và
        phương thức định nghĩa ở class cha.
         */
    }
}
