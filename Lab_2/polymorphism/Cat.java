package Lab_2.polymorphism;

public class Cat extends Animal {
    Cat() {
        super("cat");
    }

    @Override
    void sound() {
        System.out.println("The cat meows");
    }
}
