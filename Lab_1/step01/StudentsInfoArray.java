package Lab_1.step01;

public class StudentsInfoArray {

    public static void main(String[] args) {
        // how do you save student names and grades?
        String[] studentName = { "John Doe", "Jane Doe", "Jim Doe" };
        String[] studentGrade = { "A", "B", "C" };

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("Student name: " + studentName[i]);
            System.out.println("Student grade: " + studentGrade[i]);
        }

    }

}
