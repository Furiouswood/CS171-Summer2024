package Lab_2.inheritance0;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("Type: Superclass, Instanced: Superclass ");
        Superclass superclass = new Superclass();
        superclass.superClassMethod();

        System.out.println("-----------------------------");
        System.out.println("Type: Subclass, Instanced: Subclass ");
        Subclass subclass = new Subclass();
        subclass.superClassMethod();
        subclass.subClassMethod();

        System.out.println("-----------------------------");
        System.out.println("Type: Superclass, Instanced: Subclass ");
        Superclass subclassInSuperclass = new Subclass();
        subclassInSuperclass.superClassMethod();
        // subclassInSuperclass.subClassMethod();

        System.out.println("-----------------------------");
        System.out.println("Type: Subsubclass, Instanced: Subsubclass ");
        Subsubclass subsubclass = new Subsubclass();
        subsubclass.superClassMethod();
        subsubclass.subClassMethod();
        subsubclass.subSubClassMethod();
    }
}
