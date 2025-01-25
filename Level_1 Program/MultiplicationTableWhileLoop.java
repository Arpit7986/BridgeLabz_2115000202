import java.util.Scanner;

public class MultiplicationTableWhileLoop {
    public static void main(String[] args) {
        double nums[] = new double[10];
        double total = 0.0;
        int index = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            double input = sc.nextDouble();

            if (input <= 0 || index == 10) {
                break;
            }

            nums[index] = input;
            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + nums[i]);
            total =total+ nums[i];
        }

        System.out.println("Total: " + total);
    }
}
