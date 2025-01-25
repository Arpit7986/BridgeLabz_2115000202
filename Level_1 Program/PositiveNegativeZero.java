import java.util.*;
public class PositiveNegativeZero{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int nums[] = new int[5];
        for(int i=0; i < nums.length ;i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < nums.length ;i++){
           if(nums[i] > 0){
                if(nums[i] % 2 ==0){
                    System.out.println(nums[i] + " is even");
                }
                else{
                    System.out.println(nums[i] + " is odd");
                }
           }
           else if(nums[i] < 0){
                System.out.println(nums[i] + " is negative");
           }
           else{
                System.out.println("zero");
           }
        }

        if(nums[0] > nums [nums.length-1]){
            System.out.println("first number is greater last number");
        }
        else if(nums[0] < nums [nums.length-1]){
            System.out.println("first number is smaller last number");
        }
        else{
            System.out.println("first number is equal to last number");
        }
    }
}