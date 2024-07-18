package Lab_2.inheritance0.example;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void sayName() {
        System.out.println("My name is in Person Class " + this.name);
    }


}
