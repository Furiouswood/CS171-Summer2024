package Midterm.Q1;

public class ClassA {
    protected int a = 10;

    ClassA() {
        System.out.println("This is a constructor.");
    }

    ClassA(int a) {
        this.a = a;
    }

    final void aFinalMethod() {
        System.out.println("This is a final method.");
    }

}
