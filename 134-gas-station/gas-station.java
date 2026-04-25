class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr=0;
        int costt=0;
        int start=0;
        for(int i=0;i<gas.length;i++)
        {
          costt+=gas[i]-cost[i];
        }
        if(costt<0)
        {
            return -1;
        }

        for(int i=0;i<gas.length;i++)
        {
            int diff= gas[i]-cost[i];
            curr=curr+diff;

            if(curr<0)
            {
                start=i+1;
                curr=0;
            }
            
        }
        return start;
    }

}