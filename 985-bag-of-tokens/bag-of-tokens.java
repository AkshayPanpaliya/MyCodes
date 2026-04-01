class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n=tokens.length;
        int left=0;
        int right=n-1;
        int score=0;
        int maxscore=0;
        while(left<=right)
        {
            if(power>=tokens[left])
            {
                power -= tokens[left];
                left++;
                score++;
                maxscore=Math.max(maxscore,score);
            }
            else if(score>0)
            {
                power+=tokens[right];
                score--;
                right--;
            }
            else
            {
                break;
            }
        }
        return maxscore;
    }
}