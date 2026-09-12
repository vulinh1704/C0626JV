package abtract_class;

public abstract class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {

    }
}


interface Log {
    //.....
}

interface LocalLog extends Log {

}

interface RemoteLog {

}