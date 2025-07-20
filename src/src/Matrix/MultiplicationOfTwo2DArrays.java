package src.Matrix;

public class MultiplicationOfTwo2DArrays {
    public static void main(String[] args) {

        int[][] First2DArray = { {1, 5, 9}, {2, 4, 6} };
        int[][] Second2DArray = { {2, 6, 10}, {3, 5, 7} };

        int rows = First2DArray.length;

        int[][] ProductOfTwo2DArray = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int cols = Math.min(First2DArray[i].length, Second2DArray[i].length);
            ProductOfTwo2DArray[i] = new int[cols];

            for (int j = 0; j < cols; j++) {
                ProductOfTwo2DArray[i][j] = First2DArray[i][j] * Second2DArray[i][j];
            }
        }

        System.out.println("Product of Two 2D Arrays (Element-wise):");
        for (int i = 0; i < ProductOfTwo2DArray.length; i++) {
            for (int j = 0; j < ProductOfTwo2DArray[i].length; j++) {
                System.out.print(ProductOfTwo2DArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
