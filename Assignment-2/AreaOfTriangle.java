import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        int area = (base * height) / 2;
        double heightInCm = height * 2.54;
        double heightInFeet = height / 12.0;
        System.out.println("Your height in cm is " + heightInCm + " cm while in feet is " + heightInFeet + " feet and in inches is " + height + " inches.");
    }
}
