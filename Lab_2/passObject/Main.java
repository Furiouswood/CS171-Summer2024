package Lab_2.passObject;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 58);
        person.display();
        Magic.doMagic(person);
        person.display();

        int x = 20;
        System.out.println("x before: " + x);
        Magic.doMagic(x);
        System.out.println("x after: " + x);
    }

}
