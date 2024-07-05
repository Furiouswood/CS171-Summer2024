package Lab_1.step03;

public class StudentsInfoWithClass {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("John Doe", "A");
        students[1] = new Student("Jane Doe", "B");
        students[2] = new Student("Jim Doe", "C");

        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Grade: " + student.getGrade());
            System.out.println();
        }
    }

}

class Student {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}
