import java.util.*;
public class PositiveNegativeZero {
    public static int postitiveNegativeZero(int n){
        if(n==0){
            return 0;
        }
        else if(n>0){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int result=postitiveNegativeZero(n);
        System.out.println(result);
    }
    
}
