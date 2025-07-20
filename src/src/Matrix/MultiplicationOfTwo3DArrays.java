package src.Matrix;

public class MultiplicationOfTwo3DArrays {

    public static void main(String[] args) {

        int[][][] First3DArray = { { { 1, 2, 3 }, { 4, 5 } }, { { 6 }, { 7, 8, 9 } } };
        int[][][] Second3DArray = { { { 10, 20, 30 }, { 40, 50 } }, { { 60 }, { 70, 80, 90 } } };

        int[][][] ProductOfTwo3DArray = new int[First3DArray.length][][];

        for (int i = 0; i < First3DArray.length; i++) {
            ProductOfTwo3DArray[i] = new int[First3DArray[i].length][];
            for (int j = 0; j < First3DArray[i].length; j++) {
                int len = Math.min(First3DArray[i][j].length, Second3DArray[i][j].length);
                ProductOfTwo3DArray[i][j] = new int[len];

                for (int k = 0; k < len; k++) {
                    ProductOfTwo3DArray[i][j][k] = First3DArray[i][j][k] * Second3DArray[i][j][k];
                }
            }
        }

        // Printing the result
        System.out.println("Product of Two 3D Arrays:");
        for (int i = 0; i < ProductOfTwo3DArray.length; i++) {
            for (int j = 0; j < ProductOfTwo3DArray[i].length; j++) {
                for (int k = 0; k < ProductOfTwo3DArray[i][j].length; k++) {
                    System.out.print(ProductOfTwo3DArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        equalsizes(); // for arrays with equal dimensions
    }

    private static void equalsizes() {
        int[][][] First3DArray = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9 }, { 10, 11, 12 } } };
        int[][][] Second3DArray = { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 70, 80, 90 }, { 100, 110, 120 } } };

        int depth = First3DArray.length;
        int rows = First3DArray[0].length;
        int cols = First3DArray[0][0].length;

        int[][][] ProductOfTwo3DArray = new int[depth][rows][cols];

        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    ProductOfTwo3DArray[i][j][k] = First3DArray[i][j][k] * Second3DArray[i][j][k];
                }
            }
        }

        System.out.println("Product of Two 3D Arrays (equal sizes):");
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(ProductOfTwo3DArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
