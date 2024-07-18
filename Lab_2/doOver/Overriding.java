package Lab_2.doOver;

public class Overriding {
    public static void main(String[] args) {
        ClassA objectA = new ClassA();
        objectA.method();

        ClassB objectB = new ClassB();
        objectB.method();

    }

}

class ClassA {
    void method() {
        System.out.println("Method in ClassA");
    }
}

class ClassB extends ClassA {
    // Overriding method
    @Override
    void method() {
        System.out.println("This is an Overridden method of ClassA:");
        super.method();
        System.out.println("Which is Overridden by ClassB as follows:");
        System.out.println("Method in ClassB");
    }
}