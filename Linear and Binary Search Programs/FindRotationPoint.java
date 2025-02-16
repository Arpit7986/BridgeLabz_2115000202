import java.util.Scanner;

public class FindRotationPoint{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []nums = new int[n];

        for(int i = 0;i < nums.length;i++){
            nums[i] = input.nextInt();
        }

        int rotationPoint = findRotationPoint(nums);
        System.out.println("Rotation Point is: " + rotationPoint);
    }

    public static int findRotationPoint(int []nums){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } 
            else {
                right = mid;
            }
        }
        return left;
    }


}