import java.util.Scanner;
public class PersonCanVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean canPersonVote =(age>= 18);
        if (canPersonVote)
        System.out.println("The person's age is " + age + " and can vote.");
        else
        System.out.println("The person's age is " + age + " and cannot vote.");
    }
}
