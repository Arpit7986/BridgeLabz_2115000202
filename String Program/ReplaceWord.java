import  java.util.*;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println("Enter word to be Replaced");
        String t=sc.nextLine();
        System.out.println("Enter the Replaced Word");
        String m=sc.nextLine();
        System.out.println("The word to Replace is "+t+" and sentence after replacement of word is "+Replace(s,t,m));
    }
    public static String Replace(String s,String t,String m)
    {
        String a[]=s.split(" ");
        String ans="";
        for(int i=0;i<a.length;i++)
        {
            if(a[i].equals(t))
            ans=ans+m+" ";
            else    
            ans=ans+a[i]+" ";
        }
        return ans.trim();
    }
}
