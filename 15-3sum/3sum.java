class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int start=0;
       
       int n=nums.length;
       List<List<Integer>> ans=new ArrayList<>();
       Arrays.sort(nums);
       for(int i=0;i<n-2;i++)
       {
         if(i > 0 && nums[i]==nums[i-1]) {
                continue;
            }
        start=i+1;
        int end=nums.length-1;
       while(start<end)
       {
        int sum=nums[i]+nums[start]+nums[end];

           if(sum==0)
           {
            ans.add(Arrays.asList(nums[i],nums[start],nums[end]));
            start++;
            end--;

        while (start < end && nums[start] == nums[start - 1]) start++;
         while (start < end && nums[end] == nums[end + 1]) end--;
           }
           else if(start<end && sum<0)
           {
               start++;
           }
           else if(start<end && sum>0)
           {
            end--;
           }
       }
       }
       return ans;

    }
}