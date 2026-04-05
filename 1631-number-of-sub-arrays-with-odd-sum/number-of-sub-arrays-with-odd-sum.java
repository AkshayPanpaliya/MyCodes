class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int even=1;
        int odd=0;
        int cursum=0;
        int total=0;
       int mod=1000000007;
        for(int i=0;i<n;i++)
        {
            cursum+=arr[i];
            if(cursum%2!=0)
            {
                odd++;
                total=(total+even)%mod;
            }
            else
            {
                even++;
                total=(total+odd)%mod;
            }
        }
return total;
        
    }

}