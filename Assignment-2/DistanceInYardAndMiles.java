import java.util.Scanner;

public class DistanceInYardAndMiles{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double distanceInFeet = input.nextInt();
        double distanceInYard = distanceInFeet / 3;
        double distanceInMiles = distanceInYard / 1760;
        System.out.println("Your Distance in feet is " + distanceInFeet + " while in yard is " + distanceInYard + " and mile is " + distanceInMiles);

    }
}