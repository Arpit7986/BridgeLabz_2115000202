import java.util.Scanner;

public class FindPeakElement {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []nums = new int[n];

        for(int i = 0;i < nums.length;i++){
            nums[i] = input.nextInt();
        }

        int peakElement = findPeakElement(nums);
        System.out.println("Peak Element is: " + peakElement);
    }

    public static int findPeakElement(int []nums){
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } 
            else {
                right = mid;
            }
        }
        return left;
    }


}