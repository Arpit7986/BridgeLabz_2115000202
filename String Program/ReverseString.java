import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the String to Reverse :- ");
        String str = sc.nextLine();
        char[] stringArray = str.toCharArray();
        int start = 0;
        int end = str.length()-1;
        while (start <= end) {
            char temp = stringArray[start];
            stringArray[start] = stringArray[end];
            stringArray[end] = temp;
            start++;
            end--;
        }
        String Reverse  = new String(stringArray);
        System.out.println("Reverse String is :- " + Reverse);
        sc.close();
    }
}