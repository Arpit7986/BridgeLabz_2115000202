import java.util.Scanner;
public class FirstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        boolean isNumber1Small = (number1 <= number2 && number1 <= number3);
        System.out.println("Is the first number the smallest? " + isNumber1Small);
    }
}
