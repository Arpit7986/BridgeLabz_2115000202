import java.util.*;
public class average_of_three_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        int n1=sc.nextInt();
        System.out.println("Enter the Second Number");
        int n2=sc.nextInt();
        System.out.println("Enter the Third Number");
        int n3=sc.nextInt();
        System.out.println("The Average of Three Number is "+(n1+n2+n3)/3);
    }
}
