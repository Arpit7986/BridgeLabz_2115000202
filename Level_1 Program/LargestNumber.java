import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        boolean isFirstNumberLargest = (number1 >= number2 && number1 >= number3);
        boolean isSecondNumberLargest = (number2 >= number1 && number2 >= number3);
        boolean isThirdNumberLargest = (number3 >= number1 && number3 >= number2);
        System.out.println("Is the first number the largest? " + isFirstNumberLargest);
        System.out.println("Is the second number the largest? " + isSecondNumberLargest);
        System.out.println("Is the third number the largest? " + isThirdNumberLargest);
    }
}
