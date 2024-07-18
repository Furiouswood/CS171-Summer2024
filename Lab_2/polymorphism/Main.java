package Lab_2.polymorphism;

public class Main {
    public static void main(String args[]) {
        // Runtime polymorphism
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.sound();
        dog.sound();
        cat.sound();

        // Compile-time polymorphism
        animal.eat();
        animal.eat("nutrition");

        dog.eat();
        dog.eat("meat");

        cat.eat();
        cat.eat("fish");

    }
}
