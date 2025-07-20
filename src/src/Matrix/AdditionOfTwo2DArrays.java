package src.Matrix;

public class AdditionOfTwo2DArrays {
    public static void main(String[] args) {

        int[][] First2DArray = { {1, 5, 9}, {2, 4,6} };
        int[][] Second2DArray = { {2, 6, 10}, {3, 5,7} };

        int rows = First2DArray.length;

        int[][] SumOfTwo2DArray = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int cols = Math.min(First2DArray[i].length, Second2DArray[i].length);
            SumOfTwo2DArray[i] = new int[cols];

            for (int j = 0; j < cols; j++) {
                SumOfTwo2DArray[i][j] = First2DArray[i][j] + Second2DArray[i][j];
            }
        }

        System.out.println("Sum of Two 2D Arrays:");
        for (int i = 0; i < SumOfTwo2DArray.length; i++) {
            for (int j = 0; j < SumOfTwo2DArray[i].length; j++) {
                System.out.print(SumOfTwo2DArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
