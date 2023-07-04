# 21. Merge Two Sorted Lists

https://leetcode.com/problems/merge-two-sorted-lists/

```java
class Solution {

    // list1 = [1,2,4], list2 = [1,3,4]
    // [1,1,2,3,4,4]

    // list1 = [], list2 = []
    // []

    // list1 = [], list2 = [0]
    // [0]

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode();
        ListNode node = dummyNode;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                node.next = list1;
                node = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                node = list2;
                list2 = list2.next;
            }
        }

        if(l1 != null) {
            node.next = l1;
        } else if (l2 != null) {
            node.next = l2;
        }

        return dummyNode.next;
    }
}
```
