class Pair {
    public int first;
    public int second;

    Pair(int x, int y) {
        this.first = x;
        this.second = y;
    }
}

class Solution {
    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length(), start = 0;
        int countS = 0, countT = 0;
        Pair result = new Pair(0, Integer.MAX_VALUE);
        if (n > m) {
            return "";
        }
        int[] mapS = new int[60], mapT = new int[60];
        for (char ch : t.toCharArray()) {
            if (mapT[ch - 'A'] == 0) {
                countT += 1;
            }
            mapT[ch - 'A'] += 1;
        }
        for (int end = 0; end < s.length(); ++end) {
            int current = s.charAt(end) - 'A';
            mapS[current] += 1;
            if (mapS[current] == mapT[current]) {
                countS += 1;
            }
            while (countS == countT) {
                int startIndex = s.charAt(start) - 'A';
                if (end - start < result.second - result.first) {
                    result.first = start;
                    result.second = end;
                }
                mapS[startIndex] -= 1;
                if (mapT[startIndex] != 0 && mapS[startIndex] < mapT[startIndex]) {
                    countS -= 1;
                }
                start += 1;
            }
        }
        if (result.second - result.first == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(result.first, result.second + 1);
    }
}