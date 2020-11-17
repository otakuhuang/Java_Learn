package headfirstjava;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
        d.eat();
        d.chaseCat();
    }
}

class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("汪!");
    }

    void eat() {

    }

    void chaseCat() {

    }
}