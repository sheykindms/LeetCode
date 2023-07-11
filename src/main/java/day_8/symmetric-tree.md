# 101. Symmetric Tree

https://leetcode.com/problems/symmetric-tree/

```java
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return traverse(root.left, root.right);
    }

    public boolean traverse(TreeNode subRoot1, TreeNode subRoot2) {
        if(subRoot1 == null && subRoot2 == null) {
            return true;
        }
        if(subRoot1 == null || subRoot2 == null) {
            return false;
        }
        if(subRoot1.val != subRoot2.val) {
            return false;
        }
        return traverse(subRoot1.left, subRoot2.right) && traverse(subRoot1.right, subRoot2.left);
    }
}
```
