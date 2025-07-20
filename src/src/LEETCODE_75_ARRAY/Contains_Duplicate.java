package src.LEETCODE_75_ARRAY;

public class Contains_Duplicate {

    public static boolean checkDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3,1};
        boolean duplicate = checkDuplicate(nums);
        
        if (duplicate) {
            System.out.println("The given array contains duplicate elements");
        } else {
            System.out.println("The given array does not contain duplicate elements");
        }
    }
}
