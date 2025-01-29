import java.util.*;
public class Anagram
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String");
        String s=sc.next();
        System.out.println("Enter Second String");
        String t=sc.next();
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            a[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]!=0)
            {
                System.out.println("Both String are Not Anagram");
                System.exit(0);
            }
        }
        System.out.println("Both String are Anagram");
    }
}