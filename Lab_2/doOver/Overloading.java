package Lab_2.doOver;

public class Overloading {

    public void print(int integerNumber) {
        System.out.println("Integer: " + integerNumber);
    }

    public void print(double doubleNumber) {
        System.out.println("Double: " + doubleNumber);
    }

    public void print(String string) {
        System.out.println("String: " + string);
    }

    public void print(int integerNumber, double doubleNumber) {
        System.out.println("Integer: " + integerNumber + ", Double: " + doubleNumber);
    }

    public void print(double doubleNumber, int integerNumber) {
        System.out.println("Double: " + doubleNumber + ", Integer: " + integerNumber);
    }

    public void print(String string, int integerNumber) {
        System.out.println("String: " + string + ", Integer: " + integerNumber);
    }

    public void print(int integerNumber, String string) {
        System.out.println("Integer: " + integerNumber + ", String: " + string);
    }

    public void print(double doubleNumber, String string) {
        System.out.println("Double: " + doubleNumber + ", String: " + string);
    }

    public void print(String string, double doubleNumber) {
        System.out.println("String: " + string + ", Double: " + doubleNumber);
    }

    public void print(int integerNumber, double doubleNumber, String string) {
        System.out.println("Integer: " + integerNumber + ", Double: " + doubleNumber + ", String: " + string);
    }

    public void print(int integerNumber, String string, double doubleNumber) {
        System.out.println("Integer: " + integerNumber + ", String: " + string + ", Double: " + doubleNumber);
    }

    public void print(double doubleNumber, int integerNumber, String string) {
        System.out.println("Double: " + doubleNumber + ", Integer: " + integerNumber + ", String: " + string);
    }

    public void print(double doubleNumber, String string, int integerNumber) {
        System.out.println("Double: " + doubleNumber + ", String: " + string + ", Integer: " + integerNumber);
    }

    public void print(String string, int integerNumber, double doubleNumber) {
        System.out.println("String: " + string + ", Integer: " + integerNumber + ", Double: " + doubleNumber);
    }

    public void print(String string, double doubleNumber, int integerNumber) {
        System.out.println("String: " + string + ", Double: " + doubleNumber + ", Integer: " + integerNumber);
    }

    // This method will not compile because it has the same signature as the first
    // public int print(int integerNumber) {
    // System.out.println("Integer: " + integerNumber);
    // return integerNumber;
    // }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.print(13);
        overloading.print(13.13);
        overloading.print("Thirteen");
        overloading.print(13, 13.13);
        overloading.print(13.13, 13);
        overloading.print("Thirteen", 13);
        overloading.print(13, "Thirteen");
        overloading.print(13.13, "Thirteen");
        overloading.print("Thirteen", 13.13);
        overloading.print(13, 13.13, "Thirteen");
        overloading.print(13, "Thirteen", 13.13);
        overloading.print(13.13, 13, "Thirteen");
        overloading.print(13.13, "Thirteen", 13);
        overloading.print("Thirteen", 13, 13.13);
        overloading.print("Thirteen", 13.13, 13);
    }

}
