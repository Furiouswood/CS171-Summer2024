package Lab_1.activity;

public class Department {
    // implement Department class which has departmentName, departmentCode
    private String name;
    private String code;

    public Department(String name) {
        this.name = name;
        this.code = "Default Value";
    }

    public Department(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void show() {
        System.out.println("Department Name: " + name);
        System.out.println("Department Code: " + code);
    }

    public static void main(String[] args) {
        Department d1 = new Department("Computer Science", "CS");
        d1.show();
    }

}
