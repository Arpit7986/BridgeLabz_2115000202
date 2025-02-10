import java.util.*;

abstract class Vehicle {
    private int vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(int vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per day: " + rentalRate);
    }
}

interface Insurable {
    public double calculateInsurance();
    public void getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private int insuranceAmount;

    public Car(int vehicleNumber, String type, double rentalRate, int insuranceAmount) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceAmount = insuranceAmount;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return insuranceAmount * 0.02;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Car Insurance Amount: " + insuranceAmount);
        System.out.println("Insurance Cost: " + calculateInsurance());
    }
}

class Bike extends Vehicle implements Insurable {
    private int insuranceAmount;

    public Bike(int vehicleNumber, String type, double rentalRate, int insuranceAmount) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceAmount = insuranceAmount;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return insuranceAmount * 0.015;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Bike Insurance Amount: " + insuranceAmount);
        System.out.println("Insurance Cost: " + calculateInsurance());
    }
}

class Truck extends Vehicle implements Insurable {
    private int insuranceAmount;

    public Truck(int vehicleNumber, String type, double rentalRate, int insuranceAmount) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceAmount = insuranceAmount;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;
    }

    @Override
    public double calculateInsurance() {
        return insuranceAmount * 0.03;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck Insurance Amount: " + insuranceAmount);
        System.out.println("Insurance Cost: " + calculateInsurance());
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(101, "Car", 1000, 5000));
        vehicles.add(new Bike(102, "Bike", 500, 2000));
        vehicles.add(new Truck(103, "Truck", 2000, 8000));

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for 5 days: " + v.calculateRentalCost(5));

            if (v instanceof Insurable) {
                Insurable insurable = (Insurable) v;
                insurable.getInsuranceDetails();
            }
            System.out.println("----------------------");
        }
    }
}
