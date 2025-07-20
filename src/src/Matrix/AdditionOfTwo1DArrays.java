package src.Matrix;

public class AdditionOfTwo1DArrays {

	public static void main(String[] args) {

		int First1DArray[] = { 1, 2, 5, 8, 3};
		int Second1DArray[] = { 10, 6, 7, 4, 9 };
		int SumOfTwo1DArray[] = new int[First1DArray.length];

		System.out.println("1 D Array's are : ");
		for (int data : First1DArray) {
			System.out.print(data + " ");
		}
		System.out.println("\n");

		System.out.println("2 D Array's are : ");
		for (int data : Second1DArray) {
			System.out.print(data + " ");
		}
		System.out.println("\n");

		// Addition of the Two 1 D's Array
		System.out.println("//Addition of the Two 1 D Array's are");
		
		 // Correct Addition of the Two 1D Arrays
        for (int i = 0; i < First1DArray.length; i++) {
            SumOfTwo1DArray[i] = First1DArray[i] + Second1DArray[i];
        }

        System.out.println("Sum of the Two 1D Arrays: ");
        for (int data : SumOfTwo1DArray) {
            System.out.print(data + " ");
        }
        
		// If lengths are unequal
        LengthsUnequal();
	}

	private static void LengthsUnequal() {
		// If lengths are unequal
        int First1DArray[] = { 1, 2, 5, 8, 3, 4 };
        int Second1DArray[] = { 10, 6, 7, 4, 9 };

        int maxLength = Math.max(First1DArray.length, Second1DArray.length);
        int SumOfTwo1DArray[] = new int[maxLength];

        // Add corresponding elements if both arrays have them
        for (int i = 0; i < maxLength; i++) {
            int a = (i < First1DArray.length) ? First1DArray[i] : 0; 
            int b = (i < Second1DArray.length) ? Second1DArray[i] : 0;
            SumOfTwo1DArray[i] = a + b;
        }

        System.out.println("Sum of the Two 1D Arrays (handling unequal lengths): ");
        for (int data : SumOfTwo1DArray) {
            System.out.print(data + " ");
        }
	}

}
