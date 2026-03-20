import java.util.*;

class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m - k + 1][n - k + 1];

        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {

                // Use Set to keep only distinct values
                Set<Integer> set = new HashSet<>();

                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        set.add(grid[x][y]);
                    }
                }

                // Convert to list
                List<Integer> vals = new ArrayList<>(set);
                Collections.sort(vals);

                // If only one distinct value
                if (vals.size() <= 1) {
                    ans[i][j] = 0;
                } else {
                    int minDiff = Integer.MAX_VALUE;
                    for (int t = 0; t < vals.size() - 1; t++) {
                        minDiff = Math.min(minDiff, vals.get(t + 1) - vals.get(t));
                    }
                    ans[i][j] = minDiff;
                }
            }
        }

        return ans;
    }
}