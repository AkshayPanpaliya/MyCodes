class Solution {
    int max(int [] nums,int idx,int[]dp)
    {    if(idx>=nums.length) return 0;
    if(dp[idx]!=-1) return dp[idx];
         int steal=nums[idx]+max(nums,idx+2,dp);
         int skip=max(nums,idx+1,dp);
         return dp[idx]= Math.max(steal,skip);
    }
    public int rob(int[] nums) {
        int []dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return max(nums,0,dp);
    }
}