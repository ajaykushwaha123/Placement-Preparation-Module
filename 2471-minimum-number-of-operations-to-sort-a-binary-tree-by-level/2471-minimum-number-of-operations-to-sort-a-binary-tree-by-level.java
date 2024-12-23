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
    public int minimumOperations(TreeNode root) {
        if(root.left == null && root.right == null){
            return 0;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int result = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            List<Integer> sortedlist = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode current = queue.poll();
                list.add(current.val);
                sortedlist.add(current.val);
                if(current.left != null){
                    queue.offer(current.left);
                }   
                if(current.right != null){
                    queue.offer(current.right);
                }
            }
            result += helper(list, sortedlist);
        }
        return result;
    }
    private int helper(List<Integer> list, List<Integer> sortedlist){
        int count = 0;
        Collections.sort(sortedlist);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < sortedlist.size(); i++){
            map.put(sortedlist.get(i), i);
        }
        for(int i = 0; i < list.size(); i++){
            while(map.get(list.get(i)) != i){
                Collections.swap(list, map.get(list.get(i)), i);
                count++;
            }
        }
        return count;
    }
    private void swap(List<Integer> list, int left, int right){
        int temp = list.get(left);
        int rightelement = list.get(right);
        list.set(left, rightelement);
        list.set(right, temp);
    }
}