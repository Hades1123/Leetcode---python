class Solution {
    public int longestOnes(int[] nums, int k) {
        int result = 0, countOne = 0, start = 0;
        for (int end = 0; end < nums.length; ++end) {
            if (nums[end] == 1) {
                countOne++;
            }
            while (end - start + 1 - countOne > k) {
                if (nums[start] == 1) {
                    countOne -= 1;
                }
                start += 1;
            }
            result = Math.max(result, end - start + 1);
        }
        return result;
    }
}