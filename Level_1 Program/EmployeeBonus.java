import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        int yearsOfService = scanner.nextInt();
        double bonus = 0.0;
        if (yearsOfService > 5)
        {
            bonus = salary * 0.05;
        }
        System.out.println("The bonus is: " + bonus);
    }
}
