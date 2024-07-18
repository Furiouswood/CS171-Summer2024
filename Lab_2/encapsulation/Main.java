package Lab_2.encapsulation;

public class Main {
    public static void main(String[] args) {
        BasicExample e = new BasicExample("John");
        System.out.println(e.getName());
        e.setName("Jane");
        e.sayName();
    }
}
