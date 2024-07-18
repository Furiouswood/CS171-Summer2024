package Lab_2.encapsulation;

public class AdvancedExample {
    private String name;
    private int age;
    private String email;

    public AdvancedExample(String name, int age, String email) {
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Email: " + this.getEmail());
    }

    public static void main(String[] args) {
        try {
            AdvancedExample person = new AdvancedExample("Alice", 30, "alice@example.com");
            person.displayInfo();

            person.setName("");
            person.setAge(-5);
            person.setEmail("invalid-email");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
