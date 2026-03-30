class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int closestsum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++)
        {
            int left=i+1;
            int right=n-1;
        while(left<right)
        {
            int currsum=nums[i]+nums[left]+nums[right];
            if (currsum == target) {
    return currsum;
}
            if(Math.abs(currsum-target)<Math.abs(closestsum-target))
          {
             closestsum=currsum;
          }
            if(currsum<target)
            {
                left++;
            }
            else if(currsum>target)
            {
                right--;
            }
            // else
            // {
            //     return currsum;
            // }
          
            }
        }
        return closestsum;
    }
}