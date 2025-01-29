import java.util.*;
public class ToggleCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            ans=ans+Character.toUpperCase(s.charAt(i));
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            ans=ans+Character.toLowerCase(s.charAt(i));
            else
            ans=ans+s.charAt(i);
        }
        System.out.println(ans);
    }
}
