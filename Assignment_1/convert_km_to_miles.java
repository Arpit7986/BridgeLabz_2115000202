import java.util.*;
public class convert_km_to_miles
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Distance in Kilometer");
        int d=sc.nextInt();
        System.out.println("The Distance in Miles is "+(d* 0.621371));
    }
}