package Lab_1.activity;

public class Teacher {
    // implement Teacher class which has teacherName, teacherId, teacherDepartment

    private String name;
    private String id;

    public Teacher(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Teacher(String name) {
        this.name = name;
        this.id = "Default Value";
    }

    public Teacher() {
        this.name = "Default Value";
        this.id = "Default Value";
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void show() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher ID: " + id);
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Dr. John Doe", "1234");
        t1.show();
    }

}
