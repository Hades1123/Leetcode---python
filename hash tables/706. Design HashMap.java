import java.util.ArrayList;
import java.util.List;

class Pair {
    public int key;
    public int value;

    public Pair(int k, int v) {
        this.key = k;
        this.value = v;
    }
}

class MyHashMap {
    private List<List<Pair>> table;
    private int len = 10000;

    public int hash(int key) {
        return key % len;
    }

    public MyHashMap() {
        table = new ArrayList<>();
        for (int i = 0; i < len; ++i) {
            table.add(new ArrayList<>());
        }
    }

    public void put(int key, int value) {
        int hash_key = hash(key);
        for (Pair pair : table.get(hash_key)) {
            if (pair.key == key) {
                pair.value = value;
                return;
            }
        }
        table.get(hash_key).add(new Pair(key, value));
    }

    public int get(int key) {
        int hash_key = hash(key);
        for (Pair pair : table.get(hash_key)) {
            if (pair.key == key) {
                return pair.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int hash_key = hash(key);
        List<Pair> list = table.get(hash_key);
        for (int i = 0; i < table.get(hash_key).size(); ++i) {
            if (list.get(i).key == key) {
                list.remove(i);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */