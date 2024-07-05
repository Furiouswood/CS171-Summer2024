package Lab_1.step05;

public class Objects {

    public static void main(String[] args) {
        // getter and setter methods are used to access and modify the private fields of
        // the Student class
        Student student = new Student("John Doe", "A");
        System.out.println("Student name: " + student.getName());
        System.out.println("Student grade: " + student.getGrade());

        student.setName("Jane Doe");
        student.setGrade("B");
        System.out.println("Student name: " + student.getName());
        System.out.println("Student grade: " + student.getGrade());

    }

}
