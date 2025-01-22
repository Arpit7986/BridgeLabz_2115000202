import java.util.*;
public class convert_celsius_to_fahrenheit 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsius");
        double c=sc.nextInt();
        double f=(double)(c*(9/5))+32.0;
        System.out.println("The Temperature in Fahrenheit is "+f);
    }
}
