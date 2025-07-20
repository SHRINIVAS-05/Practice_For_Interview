package src.APNA_COLLEGE;

public class MaximumProductSubarray {
    public static int MaximumProduct1(int[] arr) {
        int n = arr.length;
        int maxProductSoFar = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            int currProduct = 1;

            for (int end = start; end < n; end++) {
                currProduct *= arr[end];
                maxProductSoFar = Math.max(maxProductSoFar, currProduct);
            }

            System.out.println("Product ending at index " + start + ": " + currProduct);
        }

        return maxProductSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + MaximumProduct1(arr));
    }
}
