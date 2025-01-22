import java.util.*;
public class calculate_simple_interest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal");
        int p=sc.nextInt();
        System.out.println("Enter the Time");
        int t=sc.nextInt();
        System.out.println("Enter the Rate");
        int r=sc.nextInt();
        System.out.println("The Simple Interest is "+(p*r*t)/100);
    }
}
