import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// class Solution {
//     public List<Integer> findAnagrams(String s, String t) {
//         List<Integer> result = new LinkedList<>();
//         if (t.length() > s.length())
//             return result;
//         Map<Character, Integer> map = new HashMap<>();
//         for (char c : t.toCharArray()) {
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }
//         int counter = map.size();

//         int begin = 0, end = 0;

//         while (end < s.length()) {
//             char c = s.charAt(end);
//             if (map.containsKey(c)) {
//                 map.put(c, map.get(c) - 1);
//                 if (map.get(c) == 0)
//                     counter--;
//             }
//             end++;

//             while (counter == 0) {
//                 char tempc = s.charAt(begin);
//                 if (map.containsKey(tempc)) {
//                     map.put(tempc, map.get(tempc) + 1);
//                     if (map.get(tempc) > 0) {
//                         counter++;
//                     }
//                 }
//                 if (end - begin == t.length()) {
//                     result.add(begin);
//                 }
//                 begin++;
//             }

//         }
//         return result;
//     }
// }

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new LinkedList<>();
        }
        List<Integer> result = new LinkedList<>();
        int[] window = new int[26];
        int[] target = new int[26];
        for (int i = 0; i < p.length(); ++i) {
            target[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(target, window)) {
            result.add(0);
        }

        for (int i = p.length(); i < s.length(); ++i) {
            window[s.charAt(i) - 'a']++;
            window[s.charAt(i - p.length()) - 'a']--;
            if (Arrays.equals(window, target)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }
}