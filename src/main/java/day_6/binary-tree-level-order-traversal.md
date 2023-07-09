# 102. Binary Tree Level Order Traversal

https://leetcode.com/problems/binary-tree-level-order-traversal/

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        traverse(list, root, 0);
        return list;
    }

    public void traverse(List<List<Integer>> list, TreeNode node, int depth) {
        if(node == null) {
            return;
        }
        List<Integer> l;
        if(depth == list.size()) {
            l = new ArrayList<>();
            l.add(node.val);
            list.add(l);
        } else {
            list.get(depth).add(node.val);
        }

        traverse(list, node.left, depth + 1);
        traverse(list, node.right, depth + 1);
    }
}
```
