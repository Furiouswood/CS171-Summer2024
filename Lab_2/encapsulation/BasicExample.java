package Lab_2.encapsulation;

public class BasicExample {
    private String name;

    public BasicExample(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void sayName() {
        System.out.println("My name is " + this.name);
    }

    public static void main(String[] args) {
        BasicExample e = new BasicExample("John");
        System.out.println(e.getName());
        e.setName("Jane");
        e.sayName();
    }

}
