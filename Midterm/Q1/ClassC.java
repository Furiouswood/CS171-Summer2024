package Midterm.Q1;

public class ClassC {
    public static int c = 30;

    public static int aStaticMethod() {
        System.out.println("This is a static method.");
        System.out.println("c=" + c);
        return c;
    }

    public void aNonStaticMethod() {
        System.out.println("This is a non-static method.");
        System.out.println("c=" + c);
    }

}
