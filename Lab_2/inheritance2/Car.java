package Lab_2.inheritance2;

public class Car extends Vehicle {
    private double maxSpeed;
    private int currentSpeed;
    private int gear;
    private int fuelLevel;
    private int fuelCapacity;
    private int fuelConsumption;
    private int mileage;
    public final static int MAGIC_NUMBER = 100;

    public Car(String brand, String model, int year, String color, double maxSpeed) {
        super(brand, model, year, color);
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        this.gear = 0;
        this.fuelLevel = 0;
        setFuelCapacity(MAGIC_NUMBER);
        setFuelConsumption(MAGIC_NUMBER / 10);
        this.mileage = 0;
    }

    public Car(double maxSpeed) {
        this();
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        this.gear = 0;
        this.fuelLevel = 0;
        setFuelCapacity(MAGIC_NUMBER);
        setFuelConsumption(MAGIC_NUMBER / 10);
        this.mileage = 0;
    }

    public Car() {
        super("Unknown Car", "Unknown Car", 0, "Unknown Car");
        this.maxSpeed = 0;
        this.currentSpeed = 0;
        this.gear = 0;
        this.fuelLevel = 0;
        this.fuelCapacity = 0;
        this.fuelConsumption = 0;
        this.mileage = 0;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed > 0 && maxSpeed < 500) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("Invalid max speed");
        }

    }

    public double getMaxSpeed() {
        if (maxSpeed > MAGIC_NUMBER) {
            System.out.println("Max speed is too high");
        }
        return maxSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed > 0 && currentSpeed < maxSpeed) {
            this.currentSpeed = currentSpeed;
        } else {
            System.out.println("Invalid current speed");
        }
        if (currentSpeed > MAGIC_NUMBER) {
            System.out.println("Current speed is too high");
        }

    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setGear(int gear) {
        if (gear >= -1 && gear <= 6) {
            this.gear = gear;
        } else {
            System.out.println("Invalid gear");
        }

    }

    public int getGear() {
        return gear;
    }

    public void setFuelLevel(int fuelLevel) {
        if (fuelLevel >= 0 && fuelLevel <= fuelCapacity) {
            this.fuelLevel = fuelLevel;
        } else {
            System.out.println("Invalid fuel level");
        }

    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelCapacity(int fuelCapacity) {
        if (fuelCapacity > 0 && fuelCapacity < MAGIC_NUMBER) {
            this.fuelCapacity = fuelCapacity;
        } else {
            this.fuelCapacity = MAGIC_NUMBER;
        }

    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption > 0 && fuelConsumption < MAGIC_NUMBER) {
            this.fuelConsumption = fuelConsumption;
        } else {
            System.out.println("Invalid fuel consumption");
        }

    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setMileage(int mileage) {
        if (mileage >= 0) {
            this.mileage = mileage;
        } else {
            System.out.println("Invalid mileage");
        }

    }

    public int getMileage() {
        return mileage;
    }

    // Overriding the move method
    @Override
    public void move() {
        this.mileage += 100;
        this.fuelLevel -= 10;
        System.out.println("Car " + this.brand + " " + this.model + " is moving");
    }

    // Overriding the stop method
    @Override
    public void stop() {
        System.out.println("Car " + this.brand + " " + this.model + " is stopped");
    }

    // Overriding the accelerate method
    @Override
    public void accelerate() {
        this.setGear(gear + 1);
        this.fuelLevel -= 5;
        this.currentSpeed += 10;
        this.mileage += 10;
        System.out.println("Car " + this.brand + " " + this.model + " is accelerating");
    }

    // Overriding the decelerate method
    @Override
    public void decelerate() {
        this.setGear(gear - 1);
        this.currentSpeed -= 10;
        this.mileage += 5;
        System.out.println("Car " + this.brand + " " + this.model + " is decelerating");
    }

    // Overriding the turnLeft method
    @Override
    public void turnLeft() {
        System.out.println("Car " + this.brand + " " + this.model + " is turning left");
    }

    // Overriding the turnRight method
    @Override
    public void turnRight() {
        System.out.println("Car " + this.brand + " " + this.model + " is turning right");
    }

    // Overriding the display method
    @Override
    public void display() {
        super.display();
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Current speed: " + currentSpeed);
        System.out.println("Gear: " + gear);
        System.out.println("Fuel level: " + fuelLevel);
        System.out.println("Fuel capacity: " + fuelCapacity);
        System.out.println("Fuel consumption: " + fuelConsumption);
        System.out.println("Mileage: " + mileage);
    }

    // New methods
    public void refuel(int fuel) {
        if (fuel > 0) {
            fuelLevel += fuel;
            if (fuelLevel > fuelCapacity) {
                fuelLevel = fuelCapacity;
            }
            System.out.println("Refueled " + fuel + " liters");
            System.out.println("Current fuel level: " + fuelLevel);
        } else {
            System.out.println("Invalid fuel amount: " + fuel);
        }
    }

    public void drive(int distance) {
        if (distance > 0) {
            int fuelNeeded = distance * fuelConsumption;
            if (fuelNeeded <= fuelLevel) {
                mileage += distance;
                fuelLevel -= fuelNeeded;
            } else {
                System.out.println("Not enough fuel");
            }
        } else {
            System.out.println("Invalid distance");
        }
    }

    public void changeGear(int gear) {
        if (gear >= -1 && gear <= 6) {
            this.gear = gear;
        } else {
            System.out.println("Invalid gear");
        }
    }

    public void changeSpeed(int speed) {
        if (speed >= 0 && speed <= maxSpeed) {
            currentSpeed = speed;
        } else {
            System.out.println("Invalid speed");
        }
    }

    public void turnOn() {
        System.out.println("Car " + this.brand + " " + this.model + " is turned on");
    }

    public void turnOff() {
        System.out.println("Car " + this.brand + " " + this.model + " is turned off");
    }

    public void honk() {
        System.out.println("Car " + this.brand + " " + this.model + " is honking");
    }

    public void breakDown() {
        this.decelerate();
        System.out.println("Car " + this.brand + " " + this.model + " is breaking");
    }

    public void openDoors() {
        System.out.println("Car " + this.brand + " " + this.model + " is opening doors");
    }

    public void closeDoors() {
        System.out.println("Car " + this.brand + " " + this.model + " is closing doors");
    }

    public void turnLightsOn() {
        System.out.println("Car " + this.brand + " " + this.model + " is turning lights on");
    }

    public void turnLightsOff() {
        System.out.println("Car " + this.brand + " " + this.model + " is turning lights off");
    }

    public void turnWipersOn() {
        System.out.println("Car " + this.brand + " " + this.model + " is turning wipers on");
    }

    public void turnWipersOff() {
        System.out.println("Car " + this.brand + " " + this.model + " is turning wipers off");
    }

    public void turnACOn() {
        System.out.println("Car " + this.brand + " " + this.model + " is turning AC on");
    }

    public void turnACOff() {
        System.out.println("Car " + this.brand + " " + this.model + " is turning AC off");
    }

    // etc.
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, "White", 180.0);
        car.refuel(car.getFuelCapacity());
        car.turnOn();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.breakDown();
        car.accelerate();
        car.decelerate();
        car.turnLeft();
        car.turnRight();
        car.stop();
        car.display();
        car.turnOff();
    }

}
