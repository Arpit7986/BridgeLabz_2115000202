import java.util.*;

public class BmiCalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPersons = sc.nextInt();
        double person[][] = new double[numPersons][3];
        String finalWeight[] = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            double height, weight;
            do {
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value.");
                }
            } while (height <= 0);

            do {
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value.");
                }
            } while (weight <= 0);

            person[i][0] = height;
            person[i][1] = weight;

            person[i][2] = weight / (height * height);

            if (person[i][2] < 18.5) {
                finalWeight[i] = "Underweight";
            } else if (person[i][2] >= 18.5 && person[i][2] <= 24.9) {
                finalWeight[i] = "Normal";
            } else if (person[i][2] >= 25.0 && person[i][2] <= 39.9) {
                finalWeight[i] = "Overweight";
            } else {
                finalWeight[i] = "Obese";
            }
        }

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person number " + (i + 1) + "'s height is " + person[i][0] + ", weight is " + person[i][1] + ", BMI is " + person[i][2] + " and status is " + finalWeight[i]);
        }
    }
}
