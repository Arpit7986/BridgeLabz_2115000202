import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicateCharacters{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String originalString = input.next();
        System.out.println("Original String Before Removing Duplicate Character: " + originalString);
        String str = removeDuplicate(originalString);

        System.out.println("Original String After Removing Duplicate Character: " + str);
    }

    public static String removeDuplicate(String originalString){
        StringBuilder str = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for(int i = 0;i < originalString.length();i++){
            char ch = originalString.charAt(i);
            if(!set.contains(ch)){
                str.append(ch);
                set.add(ch);
            }
        }
        return str.toString();

    }
}