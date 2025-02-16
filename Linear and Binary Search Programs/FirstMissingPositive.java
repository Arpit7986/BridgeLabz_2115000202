import java.util.Scanner;

public class FirstMissingPositive {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []nums = new int[n];

        for(int i = 0;i < nums.length;i++){
            nums[i] = input.nextInt();
        }

        int missingPositive = firstMissingPositive(nums);
        System.out.println("First Missing Positive is: " + missingPositive);
    }

    public static int firstMissingPositive(int []nums){
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
            int temp = nums[nums[i] - 1];
            nums[nums[i] - 1] = nums[i];
            nums[i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
            return i + 1;
            }
        }

        return n    }


}