import java.util.HashSet;
import java.util.Set;

// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         int begin = 0, end = 0;
//         long result = 0, currentSum = 0;
//         Map<Integer, Integer> map = new HashMap<>();
//         while (end < nums.length) {
//             int current = nums[end];
//             currentSum += current;
//             map.put(current, map.getOrDefault(current, 0) + 1);
//             while (map.get(current) > 1 || end - begin + 1 > k) {
//                 int temp = nums[begin];
//                 map.put(temp, map.get(temp) - 1);
//                 currentSum -= temp;
//                 begin++;
//             }
//             end++;
//             if (end - begin == k) {
//                 result = Math.max(result, currentSum);
//             }
//         }
//         return result;
//     }
// }

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int begin = 0, end = 0;
        long maxSum = 0, currentSum = 0;
        Set<Integer> hashSet = new HashSet<>();
        for (end = 0; end < nums.length; ++end) {
            while (hashSet.contains(nums[end])) {
                hashSet.remove(nums[begin]);
                currentSum -= nums[begin++];
            }
            hashSet.add(nums[end]);
            currentSum += nums[end];

            if (end - begin + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                hashSet.remove(nums[begin]);
                currentSum -= nums[begin++];
            }
        }
        return maxSum;
    }
}