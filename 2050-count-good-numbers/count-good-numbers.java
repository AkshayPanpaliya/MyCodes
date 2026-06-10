class Solution {
    static final int mod=1000000007;
    public int countGoodNumbers(long n) {
        
        long evenIndices=(n+1)/2;
        long oddIndices=n/2;
        long odd=power(5,evenIndices);
        long even=power(4,oddIndices);
        return (int)((even*odd)%mod);

    }
    static long power(long base,long exp)
    {
        long res=1;
        base=base%mod;

        while(exp>0)
        {
            if(exp%2==1)
            {
                res=(res*base)%mod;

            }
            base=(base*base)%mod;
            exp=exp/2;
        }
        return res;
    }
}