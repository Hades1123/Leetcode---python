import java.util.ArrayDeque;
import java.util.Queue;

//! time - O(n(log n))  -- overthinking
class Pair<U, V> {
    public final U first;
    public final V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int[] countBits(int n) {
        if (n == 0) {
            return new int[1];
        }
        int[] list = new int[n + 1];
        int index = 1;
        Queue<Pair<String, Integer>> q = new ArrayDeque<>();
        q.offer(new Pair<>("1", 1));
        for (int i = 1; i <= n; ++i) {
            q.offer(new Pair<>(q.peek().first + "0", q.peek().second));
            q.offer(new Pair<>(q.peek().first + "1", q.peek().second + 1));
            list[index++] = q.peek().second;
            q.poll();
        }
        return list;
    }
}