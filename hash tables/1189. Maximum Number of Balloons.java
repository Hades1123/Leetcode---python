
//! Using array for mapping
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] map = new int[123];
        for (char ch : text.toCharArray()) {
            map[ch - 'a'] += 1;
        }
        int result = map[0];
        int[] temp = new int[] { map[0], map['b' - 'a'], map['l' - 'a'] / 2, map['o' - 'a'] / 2, map['n' - 'a'] };
        for (int item : temp) {
            result = Math.min(result, item);
        }
        return result;
    }
}

// ! Using ?

// import java.util.HashMap;
// import java.util.Map;

// class Solution {
// public int maxNumberOfBalloons(String text) {
// Map<Character, Integer> map = new HashMap<>();
// int result = Integer.MAX_VALUE;
// for (char ch : text.toCharArray()) {
// map.put(ch, map.getOrDefault(ch, 0) + 1);
// }
// for (char ch : new char[] { 'b', 'a', 'l', 'o', 'n' }) {
// int v = map.getOrDefault(ch, 0);
// if (ch == 'l' || ch == 'o')
// v /= 2;
// result = Math.min(result, v);
// }
// return result;
// }
// }