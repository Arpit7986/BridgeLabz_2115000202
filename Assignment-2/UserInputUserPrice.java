import java.util.Scanner;

public class UserInputUserPrice {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int unitPrice=sc.nextInt();
       int quantity=sc.nextInt();
       int totalPurchase=unitPrice*quantity;
       System.out.println("The total purchase price is INR "+totalPurchase+" if the quantity is "+quantity+" and unit price is INR "+unitPrice); 
    }
}
