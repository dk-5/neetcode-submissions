class Node {
    int key, val;
    Node prev, next;

    Node(int key, int value) {
        this.key = key;
        this.val = value;
    }
}

class LRUCache {
    Map<Integer, Node> a;
    int cap;
    Node left, right;

    public LRUCache(int capacity) {
        a = new HashMap<>();
        cap = capacity;

        left = new Node(0, 0);
        right = new Node(0, 0);

        left.next = right;
        right.prev = left;
    }

    public void remove(Node n) {
        Node prev = n.prev;
        Node nxt = n.next;

        prev.next = nxt;
        nxt.prev = prev;
    }

    public void insert(Node n) {
        Node prev = right.prev;
        Node nxt = right;

        prev.next = n;
        n.prev = prev;

        n.next = nxt;
        nxt.prev = n;
    }

    public int get(int key) {
        if (!a.containsKey(key)) return -1;

        Node n = a.get(key);
        remove(n);
        insert(n);
        return n.val;
    }

    public void put(int key, int value) {
        if (a.containsKey(key)) {
            remove(a.get(key));
            a.remove(key);
        }

        Node n = new Node(key, value);
        a.put(key, n);
        insert(n);

        if (a.size() > cap) {
            Node lru = left.next;
            remove(lru);
            a.remove(lru.key);
        }
    }
}