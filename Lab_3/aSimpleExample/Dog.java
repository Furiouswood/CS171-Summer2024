package Lab_3.aSimpleExample;

// An abstract class

// Subclass of Animal
class Dog extends Animal {
    // Implement the abstract method from Animal
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}
