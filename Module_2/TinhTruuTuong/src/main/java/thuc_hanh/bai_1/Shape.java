package thuc_hanh.bai_1;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void display() {
        System.out.println("Name: " + this.name + " Area: " + this.calculateArea());
    }
}
