import java.util.Scanner;

public class FirstNegativeNumber {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int []arr = new int[size];
        for(int i = 0;i < size;i++){
            arr[i] = input.nextInt();
        }

        int negativeElementIndex = firstNegativeNumber(arr);
        System.out.println("First Negative Number Index: " + negativeElementIndex);
    }

    public static int firstNegativeNumber(int []arr){
        int index = -1;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < 0){
                return i;
            }
        }
        return index;
    }
}