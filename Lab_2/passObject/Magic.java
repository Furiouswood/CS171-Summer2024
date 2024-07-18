package Lab_2.passObject;

public final class Magic {

    public static void doMagic(int x) {
        x = 18;
    }

    public static void doMagic(Person p) {
        p.setName("Manipulated " + p.getName());
        p.setAge(18);
    }

}
