import java.util.Scanner;

public class ReverseString{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String originalString = input.next();
        System.out.println("Original String: " + originalString);
        String reverseString = reverse(originalString);

        System.out.println("Reverse String: " + reverseString);
    }

    public static String reverse(String originalString){
        StringBuilder str = new StringBuilder(originalString);
        return str.reverse().toString();
    }
}