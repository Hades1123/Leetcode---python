import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         Map<Character, Integer> map = new HashMap<>();
//         int begin = 0, end = 0, counter = 0;

//         for (char ch : s1.toCharArray()) {
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         counter = map.size();

//         while (end < s2.length()) {
//             char current = s2.charAt(end);
//             if (map.containsKey(current)) {
//                 map.put(current, map.get(current) - 1);
//                 if (map.get(current) == 0) {
//                     counter--;
//                 }
//             }

//             end++;

//             while (counter == 0) {
//                 if (end - begin == s1.length()) {
//                     return true;
//                 }
//                 char temp = s2.charAt(begin);
//                 if (map.containsKey(temp)) {
//                     map.put(temp, map.get(temp) + 1);
//                     if (map.get(temp) > 0) {
//                         counter++;
//                     }
//                 }
//                 begin++;
//             }
//         }

//         return false;
//     }
// }

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        int[] target = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < s1.length(); ++i) {
            target[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(target, window)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); ++i) {
            window[s2.charAt(i) - 'a']++;
            window[s2.charAt(i - s1.length()) - 'a']--;
            if (Arrays.equals(window, target)) {
                return true;
            }
        }
        return false;
    }
}