public class Vehicle{
    private String ownerName;
    private String vehicleType;
    static int registrationFee;

     public Vehicle(String ownerName, String vehicleType, int registrationFee){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationFee = registrationFee;
    }

    public String getOwnerName(){
        System.out.println("Owner Name is : " + ownerName);
        return this.ownerName;
    }

    public void setOwnerName(String newOwnerName){
        this.ownerName = newOwnerName;
    } 

    public String getVehicleType(){
        System.out.println("Vehicle Type is : " + vehicleType);
        return this.vehicleType;
    }

    public void setVehicleType(String newVehicleType){
        this.vehicleType = newVehicleType;
    } 

    public int getRegistrationFee(){
        System.out.println("Registration Fee is : " + registrationFee);
        return this.registrationFee;
    }

    public static void updateRegistrationFee(int newRegistrationFee){
        this.registrationFee = newRegistrationFee;
    } 

    public void displayCourseDetails(){
        System.out.println("Vehic Details : ");
        System.out.println("Owner Name = " + this.ownerName);
        System.out.println("Vehicle Type = " + this.vehicleType);
        System.out.println("Registration Fees = " + this.registrationFee);
        System.out.println();
    }
}

class Main{
    public static void main(String []args){
        Vehicle vehicle1 = new Vehicle("Arpit Jain", "Car", 999);
        System.out.println("Owner Name: " + vehicle1.getOwnerName());
        System.out.println("Vehicle Type: " + vehicle1.getVehicleType());
        System.out.println("Registration Fee: " + vehicle1.getRegistrationFee());

        Vehicle vehicle2 = new Vehicle("Ajay Jain", "Activa", 500);
        System.out.println("Owner Name: " + vehicle2.getOwnerName());
        System.out.println("Vehicle Type: " + vehicle2.getVehicleType());
        System.out.println("Registration Fee: " + vehicle2.getRegistrationFee());

    }
}