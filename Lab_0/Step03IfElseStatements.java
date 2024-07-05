package Lab_0;

public class Step03IfElseStatements {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        boolean yes = true;
        boolean no = false;

        // if-else statements
        if (yes) {
            System.out.println("it is true");
        } else {
            System.out.println("it is false");
        }

        if (no) {
            System.out.println("it is true");
        } else {
            System.out.println("it is false");
        }

        if (yes && no) {
            System.out.println("it is true");
        } else {
            System.out.println("it is false");
        }

        if (yes || no) {
            System.out.println("it is true");
        } else {
            System.out.println("it is false");
        }

        if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is positive");
        }
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else {
            System.out.println(x + " is less than " + y);
        }

    }
}
