package Lab_1.step07;

class Student {
    private String name;
    private String grade;

    public Student() {
        this.name = "Default Name";
        this.grade = "A";
    }

    public Student(String name) {
        this.name = name;
        this.grade = "A";
    }

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.toUpperCase();
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
