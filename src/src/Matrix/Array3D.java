package src.Matrix;

public class Array3D {

	public static void main(String[] args) {

		int arr[][][] = { { { 1, 2, 4 }, { 4, 8, 9, 7 }, { 2, 6, 1, 7, 4 } } };

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
