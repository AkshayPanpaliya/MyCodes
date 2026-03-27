class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        k=k%n;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int newcol;
                if(i%2==0)
                {
                    newcol=(k+j)%n;
                }
                else 
                {
                    newcol=(j-k+n)%n;
                }
                if(mat[i][j]!=mat[i][newcol]) return false;
            }
        }
        return true;
        
    }
}