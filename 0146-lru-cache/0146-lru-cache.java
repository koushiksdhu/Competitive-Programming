class LRUCache {

    Node head = new Node(0, 0), tail = new Node(0, 0);
    Map<Integer, Node> hm = new HashMap<>();
    int cap;

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            Node node = hm.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            remove(hm.get(key));
        }
        if(hm.size() == cap){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    private void remove(Node node){
        hm.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node){
        hm.put(node.key, node);
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    class Node {
        Node prev, next;
        int key, value;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */