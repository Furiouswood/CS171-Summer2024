package Lab_3.aSimpleExample;

abstract class Animal {
    abstract void sound(); // abstract method

    // non-abstract method
    void breath() {
        System.out.println("The animal breathes");
    }
}