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
    int count = 0;
    int value = 0;
    public void inorder(TreeNode root,int k){
        if(root.left != null){
            inorder(root.left,k);
        }
        count++;
        if(count == k){
            value = root.val;
            return;
        }
        if(root.right != null){
            inorder(root.right,k);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return value;
    }
}