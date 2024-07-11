package Lab_2.passObject;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
            this.age = 0;
        }
        this.age = age;
    }

    public String getAge() {
        return this.name;
    }

    public static void main(String[] args) {
        Person p = new Person("John", 20);
        p.display();
        p.setName("Jane");
        p.setAge(25);
        p.display();
    }

}
