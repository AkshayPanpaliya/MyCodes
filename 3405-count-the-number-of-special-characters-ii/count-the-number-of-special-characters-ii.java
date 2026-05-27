class Solution {
    public int numberOfSpecialChars(String word) {
        int[] firstUpper = new int[26];
        int[] lastLower = new int[26];

        // Initialize
        for (int i = 0; i < 26; i++) {
            firstUpper[i] = -1;
            lastLower[i] = -1;
        }

        // Store:
        // - first occurrence of uppercase letter
        // - last occurrence of lowercase letter
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                lastLower[ch - 'a'] = i;
            } else {
                int idx = ch - 'A';
                if (firstUpper[idx] == -1) {
                    firstUpper[idx] = i;
                }
            }
        }

        int count = 0;

        // Check condition:
        // last lowercase occurrence < first uppercase occurrence
        for (int i = 0; i < 26; i++) {
            if (lastLower[i] != -1 &&
                firstUpper[i] != -1 &&
                lastLower[i] < firstUpper[i]) {
                count++;
            }
        }

        return count;
    }
}