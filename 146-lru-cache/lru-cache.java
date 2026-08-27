import java.util.*;

class LRUCache {

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int capacity;
    HashMap<Integer, Node> map;

    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    // Node ko front me add karo
    private void add(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    // Node ko list se remove karo
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        // Recently used bana do
        remove(node);
        add(node);

        return node.value;
    }

    public void put(int key, int value) {

        // Agar key already exist karti hai
        if (map.containsKey(key)) {

            Node node = map.get(key);

            node.value = value;

            remove(node);
            add(node);

        } else {

            // Cache full hai
            if (map.size() == capacity) {

                // Tail ke just previous = least recently used
                Node lru = tail.prev;

                remove(lru);
                map.remove(lru.key);
            }

            Node newNode = new Node(key, value);

            add(newNode);
            map.put(key, newNode);
        }
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */