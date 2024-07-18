package Lab1;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Math", "101", "4");
        Student student = new Student("Henry", "123456", "CS");
        Teacher teacher = new Teacher("John", "098765", "CS");
        Department department = new Department("CS", "66666");
        University university = new University("Atl", "Emory");

        // Print information for each object
        course.printInfo();
        student.printInfo();
        teacher.printInfo();
        department.printInfo();
        university.printInfo();
    }
}
