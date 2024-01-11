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
    int ans;
    public int maxAncestorDiff(TreeNode root) {
        ans = 0;

        helper(root, root.val, root.val);

        return ans;
    }

    void helper(TreeNode root, int min, int max){
        if(root == null)
            return;

        int dif = Math.max(Math.abs(min - root.val), Math.abs(max - root.val));
        ans = Math.max(ans, dif);

        helper(root.left, Math.min(min, root.val), Math.max(max, root.val));
        helper(root.right, Math.min(min, root.val), Math.max(max, root.val));
    }
}