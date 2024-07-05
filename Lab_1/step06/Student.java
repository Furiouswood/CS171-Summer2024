package Lab_1.step06;

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
