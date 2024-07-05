package Lab_1.activity;

public class Student {
    // implement Student class which has studentName, studentId, studentDepartment
    private String name;
    private String id;
    private String department;

    public Student(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.department = "Default Value";
    }

    public Student(String name) {
        this.name = name;
        this.id = "Default Value";
        this.department = "Default Value";
    }

    public Student() {
        this.name = "Default Value";
        this.id = "Default Value";
        this.department = "Default Value";
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void show() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student Department: " + department);
    }

    public static void main(String[] args) {
        Student s1 = new Student("John Doe", "1234", "CS");
        s1.show();
    }

}
