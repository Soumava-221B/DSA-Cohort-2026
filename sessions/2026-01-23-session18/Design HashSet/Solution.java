import java.util.LinkedList;

class MyHashSet {

    private final int SIZE = 1000;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[SIZE];

        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        int index = key % SIZE;

        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }

    public void remove(int key) {
        int index = key % SIZE;

        buckets[index].remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = key % SIZE;

        return buckets[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */