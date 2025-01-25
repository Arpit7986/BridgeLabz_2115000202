import java.util.*;

public class FrequencyOfEachDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] frequency = new int[10];
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            frequency[digit]++;
            temp =temp/ 10;
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
    }
}
