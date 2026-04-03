class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];

        for (int len = 2; len <= n; len++) {
            for (int l = 1; l <= n - len + 1; l++) {
                int r = l + len - 1;
                dp[l][r] = Integer.MAX_VALUE;

                for (int k = l; k <= r; k++) {
                    int left = (k - 1 >= l) ? dp[l][k - 1] : 0;
                    int right = (k + 1 <= r) ? dp[k + 1][r] : 0;

                    int cost = k + Math.max(left, right);
                    dp[l][r] = Math.min(dp[l][r], cost);
                }
            }
        }

        return dp[1][n];
    }
}