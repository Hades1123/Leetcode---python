public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }
        int minLen = Integer.MAX_VALUE;
        for (int j = 1; j <= n; j++) {
            int needed = prefix[j] - target;
            int pos = upperBound(prefix, 0, j, needed);
            int i = pos - 1;
            if (i >= 0) {
                minLen = Math.min(minLen, j - i);
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    private int upperBound(int[] arr, int left, int right, int value) {
        int ans = right + 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > value) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
