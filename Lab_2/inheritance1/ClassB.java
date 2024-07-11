package Lab_2.inheritance1;

public class ClassB extends ClassA {
    // Method overriding
    @Override
    void sayName() {
        System.out.println("My name is B");
    }

    // Method overloading
    void sayName(String name) {
        System.out.println("My name is " + name);
    }

    void extraMethodB() {
        System.out.println("I am extra in B");
    }

}
