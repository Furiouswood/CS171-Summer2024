package Lab_1.step06;

public class Objects {

    public static void main(String[] args) {
        // default constructor
        // Student student = new Student();
        Student student = new Student("X Doe");
        System.out.println("Student name: " + student.getName());
        System.out.println("Student grade: " + student.getGrade());

        student.setName("Jane Doe");
        student.setGrade("B");
        System.out.println("Student name: " + student.getName());
        System.out.println("Student grade: " + student.getGrade());

    }

}
