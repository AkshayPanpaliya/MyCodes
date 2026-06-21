class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        for(int cost:costs)
        {
          max=Math.max(max,cost);
        }
        int [] freq=new int[max+1];
        for(int cost:costs)
        {
            freq[cost]++;
        }
        int count=0;
    for(int cost=0;cost<=max;cost++)
    {
        if(freq[cost]==0)
            {
                continue;
            }
        int buy=Math.min(freq[cost],coins/cost);
        count+=buy;
        coins-=buy*cost;
        if(coins<cost)
        {
            break;
        }
    }
        return count;
    }
}