import java.util.*;
public class UserInputHeight {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int height=input.nextInt();
        double inches=(height/2.54);
        double feet=(inches/12);
        System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inches);
    }
}
