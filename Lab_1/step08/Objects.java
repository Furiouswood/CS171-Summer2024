package Lab_1.step08;

import java.util.Scanner;

public class Objects {

    public static void main(String[] args) {
        // get student name from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            students[i] = new Student(name);
        }

        for (int i = 0; i < n; i++) {
            students[i].printInfo();
        }

        scanner.close();

    }

}
