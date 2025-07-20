

public class SplitStringCountVowels {

    public static boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        String a = s.substring(0, mid);
        String b = s.substring(mid);

        return countVowels(a) == countVowels(b);
    }

    private static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Test the function
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));      // Output: true
        System.out.println(halvesAreAlike("textbook"));  // Output: false
    }
}



/*
write java code for it
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
Return true if a and b are alike. Otherwise, return false.
Example 1:
Input: s = "book"
Output: true
 
Example 2:
Input: s = "textbook"
Output: false
*/