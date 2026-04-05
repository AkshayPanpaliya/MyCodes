class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int minsum=nums[0];
        int maxsum=nums[0];
        int result=maxsum;
        for(int i=1;i<n;i++)
        {
            if(nums[i]<0)
            {
              int temp=maxsum;
              maxsum=minsum;
              minsum=temp;
            }
           maxsum=Math.max(nums[i],maxsum*nums[i]);
           minsum=Math.min(minsum*nums[i],nums[i]);

           result=Math.max(result,maxsum);
        }
        return result;
    }
}