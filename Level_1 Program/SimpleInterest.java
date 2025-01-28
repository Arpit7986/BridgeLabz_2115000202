import java.util.*;
public class SimpleInterest
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        System.out.println("The Simple Interest is "+Calculate(principal, rate, time)+" for Principal "+principal+ ", Rate of Interest "+rate+" and Time "+time);
    }
    public static int Calculate(int principal,int rate,int time)
    {
        int simpleInterest=(principal*rate*time)/100;
        return simpleInterest;
    }
}