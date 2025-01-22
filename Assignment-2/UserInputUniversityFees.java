import java.util.*;
public class UserInputUniversityFees {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int fees=input.nextInt();
        int discountPercent=input.nextInt();
        int discount=(fees*discountPercent)/100;
        int result=fees-discount;
        System.out.println("The Discount Amount is INR "+discount+" and the final discounted fees is INR "+result);
    }
}
