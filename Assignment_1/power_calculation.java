import java.util.*;
public class power_calculation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base");
        int b=sc.nextInt();
        System.out.println("Enter the Exponent");
        int e=sc.nextInt();
        double power=(double)Math.pow(b,e);
        System.out.println("The Power is "+power);
    }
}
