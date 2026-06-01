class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int count=0;
        int n=cost.length;
        int sum=0;
        for(int i=n-1;i>=0;i--)
        {
          if(count==2)
          {
            count=0;
            continue;
          }
          sum+=cost[i];
          count++;
        }
    return sum;
    }
}