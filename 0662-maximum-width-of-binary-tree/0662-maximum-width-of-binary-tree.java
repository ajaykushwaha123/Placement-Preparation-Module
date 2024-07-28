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
    public int widthOfBinaryTree(TreeNode root) {
        var max = 0;
    var queue = new ArrayDeque<TreeNode>();
    root.val = 0;
    queue.offer(root);

    while (!queue.isEmpty()) {
      int l = 0, r = 0, n = queue.size();

      for (var i = n; i > 0; i--) {
        var node = queue.poll();

        if (i == n) l = node.val;
        if (i == 1) r = node.val;

        if (node.left != null) {
          node.left.val = node.val * 2;
          queue.offer(node.left);
        }
        if (node.right != null) {
          node.right.val = node.val * 2 + 1;
          queue.offer(node.right);
        }
      }
      max = Math.max(max, r - l + 1);
    }
    return max;
    }
}