package Lab_3.aSimpleExample;

// Test the classes
public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // This would be a compile error since you
        // can't instantiate an abstract class

        EatingDog dog = new EatingDog();

        dog.sound(); // Outputs: "The dog barks"
        dog.breath(); // Outputs: "The animal breathes"
        dog.eat("meat"); // Outputs: "The dog eats meat"
    }
}
