import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfEmployees = 10;
        double salary [] = new double[numberOfEmployees];
        double yearsOfService[] = new double[numberOfEmployees];
        double bonus[]= new double[numberOfEmployees];
        double newSalary[] = new double[numberOfEmployees];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        int index = 0;
        while (index < numberOfEmployees) {
            double employeeSalary = sc.nextDouble();
            if (employeeSalary <= 0) {
                System.out.println("enter a positive value.");
                continue;
            }
            double serviceYears = sc.nextDouble();
            if (serviceYears < 0) {
                continue;
            }
            salary[index] = employeeSalary;
            yearsOfService[index] = serviceYears;
            index++;
        }
        for (int i = 0; i < numberOfEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus =totalBonus+ bonus[i];
            totalOldSalary =totalOldSalary+ salary[i];
            totalNewSalary = totalNewSalary+newSalary[i];
        }

        System.out.println("Total Bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}
