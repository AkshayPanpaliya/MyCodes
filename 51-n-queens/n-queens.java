import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        
        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n]; // row - col + n
        boolean[] diag2 = new boolean[2 * n]; // row + col
        
        backtrack(0, n, board, result, cols, diag1, diag2);
        return result;
    }
    
    private void backtrack(int row, int n, char[][] board, 
                           List<List<String>> result,
                           boolean[] cols, boolean[] diag1, boolean[] diag2) {
        
        if (row == n) {
            result.add(construct(board));
            return;
        }
        
        for (int col = 0; col < n; col++) {
            int d1 = row - col + n;
            int d2 = row + col;
            
            if (cols[col] || diag1[d1] || diag2[d2]) continue;
            
            // place queen
            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;
            
            backtrack(row + 1, n, board, result, cols, diag1, diag2);
            
            // remove queen (backtrack)
            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }
    
    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }
}