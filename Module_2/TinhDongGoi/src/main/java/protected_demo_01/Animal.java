package protected_demo_01;

public class Animal {
    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    protected void showName() {
        System.out.println(this.name);
    }
}

/*
protected: là 1 từ khóa access modifier
Phạm vi: cho phép truy cùng 1 package
và khác package nhưng phải trong mối quan hệ kế thừa (extend)
 */