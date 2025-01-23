import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double userInput = scanner.nextDouble();
            if (userInput <= 0) {
                break;
            }
            total=total+userInput;
        }
        System.out.println("Total sum: " + total);
    }
}
