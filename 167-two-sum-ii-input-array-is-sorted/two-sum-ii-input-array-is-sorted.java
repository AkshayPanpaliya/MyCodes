class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int low=0;
     int high=numbers.length-1;
     int [] num=new int[2];
     while(low < high)
     {
        int sum=numbers[low]+numbers[high];
        if(sum<target)
        {
            low++;
        }
        else if(sum>target)
        {
            high--;
        }
        else
        {
            num[0]=low+1;
            num[1]=high+1;
            return  num;
        }
     }
     return new int []{-1,-1};
    }
}