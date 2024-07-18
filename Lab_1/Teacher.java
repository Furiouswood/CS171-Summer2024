package Lab1;

public class Teacher {

  String teacherName;
  String teacherId;
  String teacherDepartment;

public Teacher(String teacherName, String teacherID, String teacherDepartment){
    this.teacherName = teacherName;
    this.teacherId = teacherID;
    this.teacherDepartment = teacherDepartment;
}

public String getName(){
    return teacherName;
}
public String getID(){
    return teacherId;
}
public String getDepartment(){
    return teacherDepartment;
}
public void setName(String name){
    this.teacherName = name;
}
public void setId(String ID){
    this.teacherId = ID;
}
public void setDepartment(String department){
    this.teacherDepartment = department;
}
public void printInfo(){
    System.out.println("Teacher's name: " + teacherName);
    System.out.println("Teacher's ID: "  + teacherId);
    System.out.println("Teacher's department: " + teacherDepartment);
}
}
