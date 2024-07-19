package Lab_2.passObject;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John1", 581);
        Person person2 = new Person("John2", 582);
        person1.display();
        person2.display();

        Magic.doMagic(person1);
        person1.display();
        person2.display();

        int x = 20;
        System.out.println("x before: " + x);
        Magic.doMagic(x);
        System.out.println("x after: " + x);
    }

}
