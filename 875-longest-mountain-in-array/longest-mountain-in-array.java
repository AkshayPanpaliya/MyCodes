class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        if(arr == null || arr.length < 3) return 0;
        int[]up=new int[n];
        int[]down=new int[n];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                up[i]=up[i-1]+1;
            }

        }
        for(int j=n-2;j>=0;j--)
        {
            if(arr[j]>arr[j+1])
            {
                down[j]=down[j+1]+1;
            }
        }
        int maxlen=0;
        for(int i=0;i<n;i++)
        {
            if(up[i]>0 && down[i]>0)
            {
                maxlen=Math.max(maxlen,up[i]+down[i]+1);
            }
        }
        return maxlen;
    }
}