# 2. Add Two Numbers

https://leetcode.com/problems/add-two-numbers/

```java
class Solution {
    // l1 = [2,4,3], l2 = [5,6,4]
    // [7,0,8]

    // l1 = [0], l2 = [0]
    // [0]

    // l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    // [8,9,9,9,0,0,0,1]

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rem = 0;
        ListNode current = new ListNode();
        ListNode dummyHead = current;
        while(l1 != null || l2 != null || rem > 0) {
            int sum = rem;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            rem = sum / 10;
            sum = sum % 10;
            ListNode next = new ListNode(sum);
            current.next = next;
            current = next;
        }
        
        return dummyHead.next;
    }
}
```
