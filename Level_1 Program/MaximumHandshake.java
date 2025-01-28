import java.util.*;
public class MaximumHandshake
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int noOfStudent=sc.nextInt();
        System.out.println("The Maximum Number of Handshakes among N number of students is "+NumberOfHandShake(noOfStudent));
    }
    public static int NumberOfHandShake(int ne)
    {
        int ans=(n*(n-1))/2;
        return ans;
    }
}