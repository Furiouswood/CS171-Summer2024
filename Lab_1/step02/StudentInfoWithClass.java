package Lab_1.step02;

public class StudentInfoWithClass {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "A");
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
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
