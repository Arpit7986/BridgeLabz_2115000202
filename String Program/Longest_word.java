import java.util.Scanner;

public class Longest_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentance: - ");
        String str = sc.nextLine();
        int longestWordIndex = 0;
        String[] words = str.split(" ");
        int maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLen) {
                maxLen = words[i].length();
                longestWordIndex = i;
            }
        }
        System.out.println("The Longest Word is : - " + words[longestWordIndex]);
        System.out.println("Longest Word Length is " + maxLen);
        sc.close();
    }
}