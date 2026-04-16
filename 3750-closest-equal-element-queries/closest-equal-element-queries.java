import java.util.*;

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        // Step 1: Map value -> list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> result = new ArrayList<>();

        // Step 2: Process queries
        for (int q : queries) {
            int val = nums[q];
            List<Integer> list = map.get(val);

            // If only one occurrence
            if (list.size() == 1) {
                result.add(-1);
                continue;
            }

            // Find index position using binary search
            int idx = Collections.binarySearch(list, q);
            int size = list.size();

            // Circular neighbors
            int prev = list.get((idx - 1 + size) % size);
            int next = list.get((idx + 1) % size);

            // Circular distance calculation
            int distPrev = Math.min(Math.abs(q - prev), n - Math.abs(q - prev));
            int distNext = Math.min(Math.abs(q - next), n - Math.abs(q - next));

            result.add(Math.min(distPrev, distNext));
        }

        return result;
    }
}