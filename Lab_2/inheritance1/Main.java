package Lab_2.inheritance1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type: ClassA, Instanced: ClassA ");
        ClassA objectA = new ClassA();
        objectA.sayName();
        objectA.extraMethodA();
        System.out.println("-----------------------------");
        System.out.println("Type: ClassB, Instanced: ClassB ");

        ClassB objectB = new ClassB();
        objectB.sayName();
        objectB.extraMethodB();
        objectB.extraMethodA();

        // Polymorphism
        System.out.println("-----------------------------");
        System.out.println("Type: ClassA, Instanced: ClassB ");
        ClassA objectBInClassA = new ClassB();
        objectBInClassA.sayName();
        objectBInClassA.extraMethodA();
        // objectBInClassA.extraMethodB();
    }
}
