package Midterm.Q1;

public class ClassB extends ClassA {
    int b = 20;

    ClassB() {
        super();
    }

    ClassB(int a, int b) {
        super(a);
        this.b = b;
    }

    public void anotherMethod(int c) {
        super.aFinalMethod();
        System.out.println("This is another method.");
        System.out.println("a=" + super.a);
    }

}
