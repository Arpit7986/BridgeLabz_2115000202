import java.util.Scanner;

public class NumberPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>0)
        System.out.println("Positive");
        else if(number<0)
        System.out.println("Negative");
        else
        System.out.println("Zero");
    }
}
