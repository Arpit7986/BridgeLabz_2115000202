import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        while (number != 0) 
        {
            number=number/10;
            count++;
        }
        System.out.println("The number of digits is: " + count);
    }
}
