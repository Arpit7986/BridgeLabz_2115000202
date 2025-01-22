import java.util.*;
public class volume_of_cylinder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius");
        int r=sc.nextInt();
        System.out.println("Enter the Height");
        int h=sc.nextInt();
        System.out.println("The Voulme Of Cylinder is "+(3.14*r*r*h));
    }
}
