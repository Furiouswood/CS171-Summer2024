package Lab_2.inheritance2;

public class Airplane extends Vehicle {

    private final static int MAGIC_NUMBER = 200;
    private double maxSpeed;
    private int currentSpeed;
    private int altitude;
    private int numberOfPassengers;
    private int maxPassengers;
    private int maxAltitude;
    private int fuelLevel;
    private int fuelCapacity;
    private int fuelConsumption;
    private int mileage;
    private boolean isFlying;
    private boolean isLanded;
    private boolean isTakingOff;
    private boolean isLanding;
    private boolean isCrashed;
    private boolean isOnFire;
    private boolean isRefueling;
    private boolean isBoarding;

    public Airplane(double maxSpeed, int maxPassengers, int maxAltitude) {
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 10;
        this.altitude = 10;
        this.numberOfPassengers = 100;
        this.maxPassengers = maxPassengers;
        this.maxAltitude = maxAltitude;
        this.fuelLevel = 100;
        this.fuelCapacity = 100;
        this.fuelConsumption = 10;
        this.mileage = 100;
        this.isFlying = false;
        this.isLanded = true;
        this.isTakingOff = false;
        this.isLanding = false;
        this.isCrashed = false;
        this.isOnFire = false;
        this.isRefueling = false;
        this.isBoarding = false;
    }

    public Airplane() {
        super("Unknown Airplane", "Unknown Airplane", 0, "Unknown Airplane");
        this.maxSpeed = 1000;
        this.currentSpeed = 10;
        this.altitude = 100;
        this.numberOfPassengers = 200;
        this.maxPassengers = 200;
        this.maxAltitude = 10000;
        this.fuelLevel = 100;
        this.fuelCapacity = 100;
        this.fuelConsumption = 10;
        this.mileage = 100;
        this.isFlying = false;
        this.isLanded = true;
        this.isTakingOff = false;
        this.isLanding = false;
        this.isCrashed = false;
        this.isOnFire = false;
        this.isRefueling = false;
        this.isBoarding = false;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed > 0 && maxSpeed < 1000) {
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

    public void setAltitude(int altitude) {
        if (altitude > 0 && altitude < maxAltitude) {
            this.altitude = altitude;
        } else {
            System.out.println("Invalid altitude");
        }
        if (altitude > MAGIC_NUMBER) {
            System.out.println("Altitude is too high");
        }

    }

    public int getAltitude() {
        return altitude;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers > 0 && numberOfPassengers < maxPassengers) {
            this.numberOfPassengers = numberOfPassengers;
        } else {
            System.out.println("Invalid number of passengers");
        }
        if (numberOfPassengers > MAGIC_NUMBER) {
            System.out.println("Number of passengers is too high");
        }

    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        if (maxPassengers > 0 && maxPassengers < 1000) {
            this.maxPassengers = maxPassengers;
        } else {
            System.out.println("Invalid max passengers");
        }

    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxAltitude(int maxAltitude) {
        if (maxAltitude > 0 && maxAltitude < 10000) {
            this.maxAltitude = maxAltitude;
        } else {
            System.out.println("Invalid max altitude");
        }

    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setFuelLevel(int fuelLevel) {
        if (fuelLevel > 0 && fuelLevel < fuelCapacity) {
            this.fuelLevel = fuelLevel;
        } else {
            System.out.println("Invalid fuel level");
        }
        if (fuelLevel > MAGIC_NUMBER) {
            System.out.println("Fuel level is too high");
        }

    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelCapacity(int fuelCapacity) {
        if (fuelCapacity > 0 && fuelCapacity < 10000) {
            this.fuelCapacity = fuelCapacity;
        } else {
            System.out.println("Invalid fuel capacity");
        }

    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption > 0 && fuelConsumption < 100) {
            this.fuelConsumption = fuelConsumption;
        } else {
            System.out.println("Invalid fuel consumption");
        }

    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setMileage(int mileage) {
        if (mileage > 0) {
            this.mileage = mileage;
        } else {
            System.out.println("Invalid mileage");
        }
        if (mileage > MAGIC_NUMBER) {
            System.out.println("Mileage is too high");
        }

    }

    public int getMileage() {
        return mileage;
    }

    public void takeOff() {
        this.setFuelLevel(this.fuelLevel - this.fuelConsumption);
        if (isLanded && !isFlying && !isCrashed && !isOnFire && !isRefueling && !isBoarding) {
            isTakingOff = true;
            isLanded = false;
            isFlying = false;
            isCrashed = false;
            isOnFire = false;
            isRefueling = false;
            isBoarding = false;
            System.out.println("Airplane is taking off");
        } else {
            System.out.println("Airplane cannot take off");
        }

    }

    public void land() {

        if (isFlying && !isLanded && !isCrashed && !isOnFire && !isRefueling && !isBoarding) {
            isLanding = true;
            isFlying = false;
            isLanded = true;
            isCrashed = false;
            isOnFire = false;
            isRefueling = false;
            isBoarding = false;
            System.out.println("Airplane is landing");
        } else {
            System.out.println("Airplane cannot land");
        }

    }

    public void crash() {
        if (isFlying && !isLanded && !isCrashed && !isOnFire && !isRefueling && !isBoarding) {
            isCrashed = true;
            isFlying = false;
            isLanded = false;
            isOnFire = false;
            isRefueling = false;
            isBoarding = false;
            System.out.println("Airplane is crashing");
        } else {
            System.out.println("Airplane cannot crash");
        }

    }

    public void catchFire() {
        if (isFlying && !isLanded && !isCrashed && !isOnFire && !isRefueling && !isBoarding) {
            isOnFire = true;
            isFlying = false;
            isLanded = false;
            isCrashed = false;
            isRefueling = false;
            isBoarding = false;
            System.out.println("Airplane is on fire");
        } else {
            System.out.println("Airplane cannot catch fire");
        }

    }

    public void refuel() {
        if (isLanded && !isFlying && !isCrashed && !isOnFire && !isRefueling && !isBoarding) {
            isRefueling = true;
            isLanded = false;
            isFlying = false;
            isCrashed = false;
            isOnFire = false;
            isBoarding = false;
            System.out.println("Airplane is refueling");
        } else {
            System.out.println("Airplane cannot refuel");
        }

    }

    public void board() {

        if (isLanded && !isFlying && !isCrashed && !isOnFire && !isRefueling && !isBoarding) {
            isBoarding = true;
            isLanded = false;
            isFlying = false;
            isCrashed = false;
            isOnFire = false;
            isRefueling = false;
            System.out.println("Airplane is boarding");
        } else {
            System.out.println("Airplane cannot board");
        }

    }

    public void display() {
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Current speed: " + currentSpeed);
        System.out.println("Altitude: " + altitude);
        System.out.println("Number of passengers: " + numberOfPassengers);
        System.out.println("Max passengers: " + maxPassengers);
        System.out.println("Max altitude: " + maxAltitude);
        System.out.println("Fuel level: " + fuelLevel);
        System.out.println("Fuel capacity: " + fuelCapacity);
        System.out.println("Fuel consumption: " + fuelConsumption);
        System.out.println("Mileage: " + mileage);
        System.out.println("Is flying: " + isFlying);
        System.out.println("Is landed: " + isLanded);
        System.out.println("Is taking off: " + isTakingOff);
        System.out.println("Is landing: " + isLanding);
        System.out.println("Is crashed: " + isCrashed);
        System.out.println("Is on fire: " + isOnFire);
        System.out.println("Is refueling: " + isRefueling);
        System.out.println("Is boarding: " + isBoarding);
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane(900.0, 400, 9000);
        airplane.setMaxSpeed(900.0);

        airplane.takeOff();
        airplane.land();
        airplane.crash();
        airplane.catchFire();
        airplane.refuel();
        airplane.board();
        airplane.display();
    }
}