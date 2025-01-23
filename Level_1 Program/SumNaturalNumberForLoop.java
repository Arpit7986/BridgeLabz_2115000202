import java.util.Scanner;

public class SumNaturalNumberForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }
        int sumFormula = n * (n + 1) / 2;
        if (sumLoop == sumFormula)
        System.out.println("Both are Same");
        else
        System.out.println("Both are Different");
    }
}
