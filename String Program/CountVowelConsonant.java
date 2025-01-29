import java.util.Scanner;

public class CountVowelConsonant {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String:- ");
    String str = sc.next();
    int vowels = 0;
    int consonants = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
            vowels++;
        }
        else{
            consonants++;
        }
    }
    System.out.println("Vowels count :- " + vowels);
    System.out.println("Consonants count :- " + consonants);
    sc.close();
   }
}