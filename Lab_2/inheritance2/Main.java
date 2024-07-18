package Lab_2.inheritance2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Type: Car, Instanced: Car ");

        System.out.println(Car.MAGIC_NUMBER);

        System.out.println("-----------------------------");
        System.out.println("Type: vehicle, Instanced: Car ");
        Vehicle vehicle = new Car();
        vehicle.move();

        System.out.println("-----------------------------");
        System.out.println("Type: Vehicle, Instanced: Airplane ");
        Vehicle airplane = new Airplane();
        airplane.move();

    }

}
