class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

       
        int[][] prefix = new int[m][n];

        prefix[0][0] = grid[0][0];

        // First row
        for (int j = 1; j < n; j++) {
            prefix[0][j] = prefix[0][j - 1] + grid[0][j];
        }

        // First column
        for (int i = 1; i < m; i++) {
            prefix[i][0] = prefix[i - 1][0] + grid[i][0];
        }

        // Fill rest
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                prefix[i][j] = grid[i][j]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }

        // Count valid submatrices
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (prefix[i][j] <= k) {
                    count++;
                }
            }
        }

        return count;
    }
}