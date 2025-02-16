import java.util.Scanner;

public class MatrixBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int target = input.nextInt();

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target found: " + found);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } 
            else if (midValue < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}
