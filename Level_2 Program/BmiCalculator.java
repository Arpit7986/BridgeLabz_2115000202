import java.util.*;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPersons = sc.nextInt();
        double heights[] = new double[numPersons];
        double weights[] = new double[numPersons];
        double bmis[] = new double[numPersons];
        String finalWeight[] = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));
            heights[i] = sc.nextDouble();
            weights[i] = sc.nextDouble();
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) {
                finalWeight[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                finalWeight[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                finalWeight[i] = "Overweight";
            } else {
                finalWeight[i] = "Obese";
            }
        }

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person number "+i+"'s ' "+"Height is "+ heights[i] +" weight is "+ weights[i]+" bmi is "+ bmis[i] +" and status is "+finalWeight[i]);
        }
    }
}
