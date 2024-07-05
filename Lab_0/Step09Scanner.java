package Lab_0;

import java.util.Scanner;

public class Step09Scanner {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = console.nextLine();
        System.out.print("Enter the number of times to repeat: ");
        int repeat = console.nextInt();
        console.close();
        Step09Args.printName(name, repeat);

    }
}
