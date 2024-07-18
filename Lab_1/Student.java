package Lab1;

public class Student {

    private String studentName;
    private String studentID;
    private String studentDepartment;

    public Student(String studentName, String studentID, String studentDepartment){
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentDepartment = studentDepartment;
    }
    public String getName(){
        return studentName;
    }
    public String getID(){
        return studentID;
    }
    public String getDepartment(){
        return studentDepartment;
    }
    public void setName(String name){
        this.studentName = name;
    }
    public void setId(String ID){
        this.studentID = ID;
    }
    public void setDepartment(String department){
        this.studentDepartment = department;
    }
    public void printInfo(){
        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: "  + studentID);
        System.out.println("Student department: " + studentDepartment);
    }

}
