package Lab_1.activity;

public class PracticeNow {
    public static void main(String[] args) {
        // here you use them the way you want
        // to help you, I show you a simple use case:

        Course course = new Course("ICS2", "CS 171", 3);
        Student student = new Student("John Doe", "1234", "CS");
        Department department = new Department("Computer Science", "CS");
        University university = new University("Emory University", "Atlanta, GA");
        Teacher teacher = new Teacher("Dr. John Doe", "1234");

        System.out.println(student.getName() + " is a student of " + student.getDepartment() + " department of "
                + university.getName() + " at " + university.getLocation());

        System.out.println(teacher.getName() + " is a teacher of " + department.getName() + " department of "
                + university.getName());

        System.out.println(student.getName() + " has taken " + course.getName() + " course of "
                + course.getCredit() + " credit.");
    }
}
