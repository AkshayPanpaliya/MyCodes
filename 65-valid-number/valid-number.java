class Solution {
    public boolean isNumber(String s) {
        s = s.trim();

        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        boolean numAfterE = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                numSeen = true;
                numAfterE = true;
            } 
            else if (ch == '+' || ch == '-') {
                // sign only valid at start or just after 'e'/'E'
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } 
            else if (ch == '.') {
                // dot not allowed after e or more than once
                if (dotSeen || eSeen) {
                    return false;
                }
                dotSeen = true;
            } 
            else if (ch == 'e' || ch == 'E') {
                // e must appear once and after a number
                if (eSeen || !numSeen) {
                    return false;
                }
                eSeen = true;
                numAfterE = false; // must have number after e
            } 
            else {
                return false;
            }
        }

        return numSeen && numAfterE;
    }
}