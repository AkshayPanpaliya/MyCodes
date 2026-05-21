class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
          StringBuilder merged = new StringBuilder();
        while(i<word1.length() && j<word2.length())
        {
          merged.append(word1.charAt(i));
          merged.append(word2.charAt(j));
          i++;
          j++;

        }
         while (i < word1.length()) {
            merged.append(word1.charAt(i));
            i++;
        }
        while (j < word2.length()) {
            merged.append(word2.charAt(j));
            j++;
        }
        return merged.toString();
    }
}