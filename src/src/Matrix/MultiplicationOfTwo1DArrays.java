package src.Matrix;

public class MultiplicationOfTwo1DArrays {

    public static void main(String[] args) {

        int First1DArray[] = { 1, 2, 5, 8, 3 };
        int Second1DArray[] = { 10, 6, 7, 4, 9 };
        int ProductOfTwo1DArray[] = new int[First1DArray.length];

        System.out.println("1st 1D Array: ");
        for (int data : First1DArray) {
            System.out.print(data + " ");
        }
        System.out.println("\n");

        System.out.println("2nd 1D Array: ");
        for (int data : Second1DArray) {
            System.out.print(data + " ");
        }
        System.out.println("\n");

        // Multiplication of the Two 1D Arrays
        System.out.println("// Multiplication of the Two 1D Arrays:");
        for (int i = 0; i < First1DArray.length; i++) {
            ProductOfTwo1DArray[i] = First1DArray[i] * Second1DArray[i];
        }

        System.out.println("Product of the Two 1D Arrays: ");
        for (int data : ProductOfTwo1DArray) {
            System.out.print(data + " ");
        }

        // Handle unequal lengths
        LengthsUnequal();
    }

    private static void LengthsUnequal() {
        // Arrays of unequal lengths
        int First1DArray[] = { 1, 2, 5, 8, 3, 4 };
        int Second1DArray[] = { 10, 6, 7, 4, 9 };

        int maxLength = Math.max(First1DArray.length, Second1DArray.length);
        int ProductOfTwo1DArray[] = new int[maxLength];

        // Multiply corresponding elements; if an element is missing, assume it's 1
        for (int i = 0; i < maxLength; i++) {
            int a = (i < First1DArray.length) ? First1DArray[i] : 1;
            int b = (i < Second1DArray.length) ? Second1DArray[i] : 1;
            ProductOfTwo1DArray[i] = a * b;
        }

        System.out.println("\nProduct of the Two 1D Arrays (handling unequal lengths): ");
        for (int data : ProductOfTwo1DArray) {
            System.out.print(data + " ");
        }
    }
}
