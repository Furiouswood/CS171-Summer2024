package Lab_1.activity;

public class Course {
    // implement Course class which has courseName, courseCode, courseCredit
    private String name;
    private String code;
    private int credit;

    public Course(String name) {
        this.name = name;
        this.code = "Default Value";
        this.credit = 0;
    }

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        this.credit = 0;
    }

    public Course(String name, String code, int credit) {
        this.name = name;
        this.code = code;
        this.credit = credit;
    }

    public String getName() {
        return this.name;

    }

    public String getCode() {
        return this.code;
    }

    public int getCredit() {
        return this.credit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void show() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Course Credit: " + credit);
    }

    public static void main(String[] args) {
        Course c1 = new Course("ICS2", "CS 171", 3);
        c1.show();
    }

}
