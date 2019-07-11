/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        
        //corner case
        
        if(root == null){
            return values;
        }
        
        postorderTraversal(root, values);
        return values;
    }
    
    
    
    private void postorderTraversal(TreeNode root, List<Integer> values){
        if(root != null){
            postorderTraversal(root.left,values);
            
            postorderTraversal(root.right,values);
            values.add(root.val);
        }
    }
}