import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of operations:");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the first number:");
            double first = sc.nextDouble();
            System.out.println("Enter the second number:");
            double second = sc.nextDouble();
            System.out.println("Enter the operation ( + , - , * , / ):");
            String op = sc.next();
            System.out.println("Result: " + switchOperation(first, second, op));
        }

        sc.close();
    }

    public static double switchOperation(double first, double second, String op) {
        switch (op) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                if (second != 0) {
                    return first / second;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return 0.0;
                }
            default:
                System.out.println("Invalid Operator");
                return 0.0;
        }
    }
}
