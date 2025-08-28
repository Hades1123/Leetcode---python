class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0, start = 0, maxCount = 0;
        int[] map = new int[26];
        for (int end = 0; end < s.length(); ++end) {
            char current = s.charAt(end);
            map[current - 'A']++;
            maxCount = Math.max(maxCount, map[current - 'A']);
            while (end - start + 1 - maxCount > k) {
                map[s.charAt(start) - 'A']--;
                start += 1;
            }
            result = Math.max(result, end - start + 1);
        }
        return result;
    }
}