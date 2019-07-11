/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        
        //corner case
        
        if(root == null){
            return values;
        }
        
        inorderTraversal(root, values);
        return values;
    }
    
    
    
    private void inorderTraversal(TreeNode root, List<Integer> values){
        if(root != null){
            inorderTraversal(root.left,values);
            values.add(root.val);
            inorderTraversal(root.right,values);
            
        }
    }
}