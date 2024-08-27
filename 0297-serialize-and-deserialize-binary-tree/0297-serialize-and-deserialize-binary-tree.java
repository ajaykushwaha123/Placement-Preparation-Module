/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "null";
        }
        String leftSerialized = serialize(root.left);
        String rightSerialized = serialize(root.right);
        return root.val +","+leftSerialized + ","+rightSerialized;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[]arr = data.split(",");
        Queue<String> q = new LinkedList<>();
        for(int i = 0; i < arr.length; i++){
            q.add(arr[i]);
        }
        TreeNode root = desria(q);
        return root;
        
        
    }
    private static TreeNode desria(Queue<String>q){
        if(q.size()==0){
            return null;
        }
        String peek = q.poll();
        if(peek.equals("null")) return null;
        TreeNode root  = new TreeNode(Integer.parseInt(peek));
        root.left = desria(q);
        root.right = desria(q);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));