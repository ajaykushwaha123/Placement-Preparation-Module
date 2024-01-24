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
    int res=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        dfs(root,0);
        return res;
    }
    void dfs(TreeNode node, int bitmask){
        if(node==null)return;
        bitmask=bitmask^(1<<node.val);
        if(node.left==null && node.right==null && (bitmask&(bitmask-1))==0)
            res++;
        else{
            dfs(node.left,bitmask);
            dfs(node.right,bitmask);
        }
    }
}