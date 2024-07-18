package Lab_2.inheritance0.example;

public class Student extends Person{
    String grade;
    public Student(String name, String grade){
        super(name);
        this.grade = grade;
    }
    public void sayName() {
        System.out.println("My name is in Student Class " + super.getName());
    }

}
