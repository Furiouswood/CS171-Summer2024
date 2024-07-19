package Midterm.Q1;

public class Main {

    public static void main(String[] args) {
        // ClassB bObject = new ClassB(30, 40);
        // bObject.anotherMethod(50);

        ClassC.aStaticMethod();
        ClassC cObject1 = new ClassC();
        ClassC.c = 40;
        ClassC cObject2 = new ClassC();

        cObject1.aNonStaticMethod();
        cObject2.aNonStaticMethod();

    }

}
