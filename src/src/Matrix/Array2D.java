package src.Matrix;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

        // Ask user for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Declare and initialize the 2D array
        int[][] matrix = new int[rows][cols];

        // Input elements into the 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Output elements of the 2D array
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
		Array2Ds();

	}

	private static void Array2Ds() {
		int arr[][]= {{1,2,4},{4,8,9,7,10}};
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
