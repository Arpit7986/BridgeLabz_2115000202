import java.util.*;
public class MostFrequent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<26;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                ans=i;
            }
        }
        System.out.println("The Most Frequent Character is "+ (char)(ans+'a'));
    }
}
