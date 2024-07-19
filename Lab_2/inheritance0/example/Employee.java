package Lab_2.inheritance0.example;

public class Employee extends Person{
    String job;
    public Employee(String name, String grade){
        super(name);
        this.job = grade;
    }
    public void sayName() {
        System.out.println("My name is in Employee Class " + super.getName());
    }
}
