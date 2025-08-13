import java.util.HashSet;
import java.util.Set;

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int begin = 0, end = 0, len = 0;
//         Map<Character, Integer> map = new HashMap<>();
//         while (end < s.length()) {
//             char current = s.charAt(end);
//             map.put(current, map.getOrDefault(current, 0) + 1);
//             while (map.get(current) > 1) {
//                 char temp = s.charAt(begin);
//                 map.put(temp, map.get(temp) - 1);
//                 begin++;
//             }
//             end++;
//             len = Math.max(len, end - begin);
//         }
//         return len;
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int begin = 0, end = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        for (end = 0; end < s.length(); ++end) {
            char current = s.charAt(end);
            while (set.contains(current)) {
                set.remove(s.charAt(begin++));
            }
            set.add(current);
            maxLen = Math.max(maxLen, end - begin + 1);
        }
        return maxLen;
    }
}