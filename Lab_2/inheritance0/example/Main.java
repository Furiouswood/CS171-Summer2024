package Lab_2.inheritance0.example;

public class Main {
    public static void info (Object obj){
        System.out.println(obj instanceof  Person);
        Person person = (Person) obj;
        person.sayName();
    }
    public static void main(String[] args) {
        Person person = new Person("P1");
        Person student = new Student("S1", "A");
        Person employee = new Employee("S1", "A");

        info(person);
        info(student);
        info(employee);





    }
}
