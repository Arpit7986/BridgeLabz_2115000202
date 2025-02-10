abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 10;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

public class RideHailingSystem {
    public static void processRide(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Total Fare for " + distance + " km: " + vehicle.calculateFare(distance));

        if (vehicle instanceof GPS) {
            GPS gpsVehicle = (GPS) vehicle;
            System.out.println("Current Location: " + gpsVehicle.getCurrentLocation());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Vehicle car = new Car(101, "Arpit Jain", 12.5, "Downtown");
        Vehicle bike = new Bike(102, "Ajay Jain", 8.0, "Uptown");
        Vehicle auto = new Auto(103, "Utkarsh Jain", 10.0, "City Center");

        processRide(car, 10);
        processRide(bike, 5);
        processRide(auto, 8);
    }
}
