# 146. LRU Cache

https://leetcode.com/problems/lru-cache/

```java
class LRUCache {
    Map<Integer, ListNode> map;
    int capacity;
    ListNode dummyHead;
    ListNode dummyTail;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        dummyHead = new ListNode(-1, -1);
        dummyTail = new ListNode(-1, -1);
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }
        ListNode node = map.get(key);
        remove(node);
        addToHead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(!map.containsKey(key)) {
            if(map.size() == capacity) {
                remove(dummyTail.prev);
            }
        } else {
            remove(map.get(key));
        }
        addToHead(new ListNode(key, value));

    }

    private void addToHead(ListNode node) {
        map.put(node.key, node);
        node.next = dummyHead.next;
        dummyHead.next.prev = node;
        dummyHead.next = node;
        node.prev = dummyHead;
    }

    private void remove(ListNode node) {
        map.remove(node.key);
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
}

class ListNode {
    int key;
    int val;
    ListNode prev;
    ListNode next;
    public ListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
```
