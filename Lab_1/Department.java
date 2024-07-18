package Lab1;

public class Department {


    String departmentName;
    String departmentCode;

    public Department(String departmentName, String departmentCode) {

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getName() {
        return departmentName;
    }

    public String getCode() {
        return departmentCode;
    }

    public void setDepartment(String name) {
        this.departmentName = name;
    }

    public void setCode(String Code) {
        this.departmentCode = Code;
    }

    public void printInfo() {
        System.out.println("Department name: " + departmentName);
        System.out.println("Department Code: " + departmentCode);
    }
}