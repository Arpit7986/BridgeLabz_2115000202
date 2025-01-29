import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String: - ");
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
            }
        }
        String modifiesString="";
        for (Character ch : set) {
            modifiesString+=ch;
        }
        System.out.println("After Removing Duplicates :- " + modifiesString);

        sc.close();
    }
}