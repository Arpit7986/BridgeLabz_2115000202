import java.util.*;
public class SubstringOccurrence {
    public static int countOccurrences(String str, String sub) {
        int count = 0,index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        String sub = sc.next();
        System.out.println("Occurrences of '" + sub + "': " + countOccurrences(str, sub));
    }
}