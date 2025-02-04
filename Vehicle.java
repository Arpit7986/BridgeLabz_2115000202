import java.util.*;
class Vehicle
{
    private static int registrationFee=500;
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;
    public Vehicle(String ownerName,String vehicleType,String registrationNumber)
    {
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }
    public static void updateRegistrationFee(int updateRegistrationFee)
    {
        registrationFee=updateRegistrationFee;
        System.out.println("Updated Registration Fees is "+registrationFee);
    }
    public void displayDetails()
    {
        if(this instanceof Vehicle)
        {
            System.out.println("Owner Name : "+ownerName);
            System.out.println("Vehicle Type : "+vehicleType);
            System.out.println("Registration Number : "+registrationNumber);
            System.out.println();
        }
        else
        System.out.println("Invalid Vehicle Instance");
    }
    public static void main(String[] args) 
    {
        Vehicle v1=new Vehicle("Arpit Jain", "Activa 5G","UP80EU3540");
        Vehicle v2=new Vehicle("Ajay Jain","BMW","UP80AV0001");
        v1.displayDetails();
        v2.displayDetails();
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Updated Registration Fees");  
        int registrationFeeUpdate=sc.nextInt();  
        Vehicle.updateRegistrationFee(registrationFeeUpdate);
    }
}