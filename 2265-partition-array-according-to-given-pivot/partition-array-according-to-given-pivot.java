class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int [] result=new int[n];
        int id=0;
        for(int num:nums)
        {
            if(num<pivot)
            {
              result[id]=num;
              id++;
            }
        }
        for(int num:nums)
        {
            if(num==pivot)
            {
              result[id]=num;
              id++;
            }
        }
        for(int num:nums)
        {
            if(num>pivot)
            {
              result[id]=num;
              id++;
            }
        }

      return result;  
    }
}