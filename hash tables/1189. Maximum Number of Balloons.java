
//! Using array for mapping
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] map = new int[123];
        for (char ch : text.toCharArray()) {
            map[ch] += 1;
        }
        int result = map['a'];
        char[] temp = new char[] { 'b', 'l', 'o', 'n' };
        for (char item : temp) {
            int value = 0;
            if (item == 'l' || item == 'o') {
                value = map[item] / 2;
            } else {
                value = map[item];
            }
            result = Math.min(value, result);
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