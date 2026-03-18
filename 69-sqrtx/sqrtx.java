class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Avoid overflow using division
            if (mid <= x / mid) {
                ans = mid;        // valid answer
                left = mid + 1;   // try bigger
            } else {
                right = mid - 1;  // too big
            }
        }

        return ans;
    }
}