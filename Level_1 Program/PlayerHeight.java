import java.util.Scanner;

public class PlayerHeight {
    public static void main(String[] args) {
        double heights[] = new double[11];
        double sum = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sum =sum+heights[i];
        }
        double mean = sum / 11;
        System.out.printf("The mean height of the football team is"+ mean);
    }
}
