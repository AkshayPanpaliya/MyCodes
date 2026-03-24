class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mod = 12345;

        int size = m * n;
        long[] prefix = new long[size];
        long[] suffix = new long[size];

        // Flatten index helper
        int idx = 0;

        // Build prefix
        prefix[0] = 1;
        for (int i = 1; i < size; i++) {
            int r = (i - 1) / n;
            int c = (i - 1) % n;
            prefix[i] = (prefix[i - 1] * grid[r][c]) % mod;
        }
        suffix[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            int r = (i + 1) / n;
            int c = (i + 1) % n;
            suffix[i] = (suffix[i + 1] * grid[r][c]) % mod;
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < size; i++) {
            int r = i / n;
            int c = i % n;
            result[r][c] = (int)((prefix[i] * suffix[i]) % mod);
        }

        return result;
    }
}