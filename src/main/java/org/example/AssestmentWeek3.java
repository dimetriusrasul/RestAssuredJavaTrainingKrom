package org.example;
import java.time.Year;

class Vehicle {
    String vehicleBrand = "Toyota";
    String vehicleModel = "Innova";
    int vehicleYear;

    public Vehicle(int yearParam) throws InvalidYearException {
        vehicleYear = yearParam;
        yearCalculation();
    }

    //overloading
    public Vehicle(int yearParam, String brand, String modelType) throws InvalidYearException {
        vehicleYear = yearParam;
        vehicleBrand = brand;
        vehicleModel = modelType;
        yearCalculation();
    }

    public void yearCalculation() throws InvalidYearException {
        int currentYear = Year.now().getValue();
        if (vehicleYear > currentYear) {
            throw new InvalidYearException("Vehicle's Year (" + vehicleYear + ") is invalid. Vihicle's year should be lower than current year (" + currentYear + ")");
        }
    }

    public void vehicleSound() {
        System.out.println("Broooom.....!!! Vehicle's brand: " + vehicleBrand + " & Vehicle's model: " + vehicleModel);
    }
}

class Motorcycle extends Vehicle {
    boolean hasSideCars = false;

    public Motorcycle(int yearParam) throws InvalidYearException {
        super(yearParam);
    }

    //overloading constructor
    public Motorcycle(int yearParam, boolean sideCar) throws InvalidYearException {
        super(yearParam);
        hasSideCars = sideCar;
    }

    @Override
    public void vehicleSound() {
        System.out.println("Broooong.....!!! Motorcycle side car type is: " + hasSideCars);
    }
}

class Car extends Vehicle {
    int carDoors = 4;

    public Car(int yearParam) throws InvalidYearException {
        super(yearParam);
    }

    //overloading constructor
    public Car(int yearParam, int door) throws InvalidYearException {
        super(yearParam);
        carDoors = door;
    }

    @Override
    public void vehicleSound() {
        System.out.println("Breeeem!!! Car has " + carDoors + " door(s)");
    }
}

//custom checked exception
class InvalidYearException extends Exception {
    public InvalidYearException(String message) {
        super(message);
    }
}

public class AssestmentWeek3 {
    public static void main(String[] args) throws InvalidYearException {
        Vehicle vehicle = new Vehicle(1999);
        vehicle.vehicleSound();

        Vehicle vehicle1 = new Vehicle(1992, "Honda", "Civic");
        vehicle1.vehicleSound();

        Vehicle motorcycle1 = new Motorcycle(2007);
        motorcycle1.vehicleSound();

        Vehicle motorcycle2 = new Motorcycle(2007, true);
        motorcycle2.vehicleSound();

        boolean exceptionThrown = false;
        try {
            Vehicle car1 = new Car(2030);
            car1.vehicleSound();
        } catch (InvalidYearException e) {
            exceptionThrown = true;
            System.out.println("Caught invalid year exception: " + e.getMessage());
        } finally {
            String message = "";
            if (exceptionThrown){
                message = "FAILED";
            } else {
                message = "SUCCESS";
            }

            System.out.println("Car object creation =  " + message);
        }

        Vehicle car2 = new Car(2023, 4);
        car2.vehicleSound();

        Vehicle car3 = new Car(2023);
        car3.vehicleSound();
    }
}


