import java.util.*;;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :- ");
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
        String reverse = new String(stringArray);
        if(str.equals(reverse)){
            System.out.println("The String is a Palindrome !!");
        }
        else{
            System.out.println("The String is not a Palindrome !!");

        }
        sc.close();
    }
}