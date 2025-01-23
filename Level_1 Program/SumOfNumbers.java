import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double userInput= scanner.nextDouble();
        while (userInput != 0) {
            total += userInput;
            //Enter Another Number
            userInput = scanner.nextDouble();
        }
        System.out.println("Total sum: " + total);
    }
}
