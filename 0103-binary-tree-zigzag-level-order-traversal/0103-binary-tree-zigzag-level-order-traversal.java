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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zlist = new ArrayList<>();
        List<Integer> list ;
        Queue<TreeNode> q = new LinkedList<>();
        int size = 0;
        boolean flag = false;

        if(root == null)
            return zlist;

        q.offer(root);

        while(!q.isEmpty())
        {
            size = q.size();
            list = new ArrayList<>();
            while(size-- >0)
            {
                root = q.poll();

                if(root.left!=null)
                  q.add(root.left);
                if(root.right!=null)
                  q.add(root.right);

                  list.add(root.val);
            }
                //reverse list
            if(flag == true)
                Collections.reverse(list);
            
            flag = !flag;
            zlist.add(list);
        }
            return zlist;
    }
}