public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private final double DAILY_RENTAL_RATE = 900.0; 

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
 
    public double calculateTotalCost() {
        return rentalDays * DAILY_RENTAL_RATE;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    
    public static void main(String[] args) {
        CarRental rental = new CarRental("Arpit Jain", "Mercedes", 4);
        System.out.println("Customer Name: " + rental.getCustomerName());
        System.out.println("Car Model: " + rental.getCarModel());
        System.out.println("Rental Days: " + rental.getRentalDays());
        System.out.println("Total Cost: $" + rental.calculateTotalCost());
    }
}