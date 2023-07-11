# 98. Validate Binary Search Tree

https://leetcode.com/problems/validate-binary-search-tree/

```java
class Solution {
    public boolean isValidBST(TreeNode root) {
        return traverse(root, null, null);
    }

    public boolean traverse(TreeNode root, Integer left, Integer right) {
        if(root == null) {
            return true;
        }
        if(left != null && root.val <= left || right != null && root.val >= right) {
            return false;
        }
        return traverse(root.left, left, root.val) && traverse(root.right, root.val, right);
    }
}
```
