package Lab_2.inheritance0;

public class Subclass extends Superclass {

    void subClassMethod() {
        System.out.println("Method from Subclass");
    }
    @Override
    void superClassMethod() {
        System.out.println("Method from Superclass but overridden ");
    }
    void anotherSubClassMethod(){}

}
