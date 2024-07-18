package Lab1;

public class Course {
    // instance variables
    public String courseName;
    public String courseCode;
    public String courseCredit;
    // object instantiation
    public Course(String courseName, String courseCode, String courseCredit){

        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseCredit = courseCredit;
    }

    public String getName(){
        return courseName;
    }
    public String getID(){
        return courseCode;
    }
    public String getCredit(){
        return courseCredit;
    }
    public void setCourse(String name){
        this.courseName = name;
    }
    public void setCode(String code){
        this.courseCode = code;
    }
    public void setCredit(String Credit){
        this.courseCredit = Credit;
    }
    public void printInfo(){
        System.out.println("Course name: " + courseName);
        System.out.println("Course code: "  + courseCode);
        System.out.println("Course credit: " + courseCredit);
    }


}