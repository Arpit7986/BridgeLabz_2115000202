class Vehicle{
    protected int maxSpeed;
    protected String feulType;

    public Vehicle(int maxSpeed , String feulType){
        this.fuelType = feulType;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo(){
        System.out.println("Max Speed :- " + maxSpeed);
        System.out.println("Fuel Type:- " + feulType);
    }
}

class car extends Vehicle{
    private int seatCapacity;
    public car(int maxSpeed , String feulType , int seatCapacity){
        super(maxSpeed, feulType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity:- " + seatCapacity);
    }
}

class Truck extends Vehicle{
    private int loadCapacity;

    public Truck(int maxSpeed , String feulType , int loadCapacity){
        super(maxSpeed, feulType);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity:- " +loadCapacity);
    }
}

class Motorcycle extends Vehicle{
    private boolean sidecar;

    public Motorcycle(int maxSpeed , String fuelType , boolean sidecar){
        super(maxSpeed, fuelType);
        this.sidecar = sidecar;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();;
        System.out.println("Sidecar: " + sidecar);
    }
}

public class VehicleTransportystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new car(120, "Diesel", 4),
            new Truck(150, "Petrol", 12),
            new Motorcycle(180, "Petrol", false)
        };

        for (Vehicle vehicle : vehicles) {
            
            vehicle.displayInfo();
            System.out.println();
        }
    }   
}
