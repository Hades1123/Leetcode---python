class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int result = 0, start = 0;
        for (int end = 0; end < s.length(); ++end) {
            arr[s.charAt(end)] += 1;
            while (arr[s.charAt(end)] > 1) {
                arr[s.charAt(start)] -= 1;
                start += 1;
            }
            result = Math.max(result, end - start + 1);
        }
        return result;
    }
}