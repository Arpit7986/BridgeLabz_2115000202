import java.util.*;
public class UserInputMaxHandshake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfStudents =sc.nextInt();
        int noOfHandshake=(numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("The Number Of Possible Handshake is "+noOfHandshake);
    }
}
