# 23. Merge k Sorted Lists

https://leetcode.com/problems/merge-k-sorted-lists/

```java
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        } else if(lists.length == 1) {
            return lists[0];
        } else {
            ListNode[] left = new ListNode[lists.length / 2];
            for(int i = 0; i < lists.length / 2; i++) {
                left[i] = lists[i];
            }
            ListNode h1 = mergeKLists(left);
            ListNode[] right = new ListNode[lists.length - lists.length / 2];
            int j = 0;
            for(int i = lists.length / 2; i < lists.length; i++) {
                right[j++] = lists[i];
            }
            ListNode h2 = mergeKLists(right);
            return mergeLists(h1, h2);
        }
    }

    public ListNode mergeLists(ListNode h1, ListNode h2) {
        ListNode dummyNode = new ListNode();
        ListNode node = dummyNode;
        while(h1 != null && h2 != null) {
            if(h1.val <= h2.val) {
                node.next = h1;
                node = h1;
                h1 = h1.next;
            } else {
                node.next = h2;
                node = h2;
                h2 = h2.next;
            }
        }
        if(h1 != null) {
            node.next = h1;
        } else if(h2 != null) {
            node.next = h2;
        }
        return dummyNode.next;
    }
}
```
