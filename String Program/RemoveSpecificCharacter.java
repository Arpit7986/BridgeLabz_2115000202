import java.util.*;
public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        System.out.println("Enter Charater to remove");
        char ch=sc.next().charAt(0);
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            continue;
            else
            ans=ans+s.charAt(i);
        }
        System.out.println(ans);
    }
}
