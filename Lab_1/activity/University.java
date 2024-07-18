package Lab_1.activity;

public class University {
    // implement University class which has universityName, universityLocation
    private String name;
    private String location;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public University(String name) {
        this.name = name;
        this.location = "Default Value";
    }

    public University() {
        this.name = "Default Value";
        this.location = "Default Value";
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void show() {
        System.out.println("University Name: " + name);
        System.out.println("University Location: " + location);

    }

    public static void main(String[] args) {
        University u1 = new University("Emory University", "Atlanta, GA");
        u1.show();
    }
}
