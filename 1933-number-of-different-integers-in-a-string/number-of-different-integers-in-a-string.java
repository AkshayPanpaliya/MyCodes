import java.util.*;

public class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> uniqueNumbers = new HashSet<>();
        int n = word.length();
        int i = 0;

        while (i < n) {
            if (Character.isDigit(word.charAt(i))) {
                int j = i;
                while (j < n && Character.isDigit(word.charAt(j))) j++;
                String num = word.substring(i, j).replaceFirst("^0+", ""); // remove leading zeros
                if (num.isEmpty()) num = "0"; // handle "0000" case
                uniqueNumbers.add(num);
                i = j;
            } else {
                i++;
            }
        }

        return uniqueNumbers.size();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String test = "a123bc34d8ef34";
        System.out.println(sol.numDifferentIntegers(test)); // Output: 3
    }
}