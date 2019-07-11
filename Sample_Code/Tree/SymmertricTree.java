//Given a binary tree, 
//check whether it is a mirror of itself (ie, symmetric around its center).

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root,root);
    }
    
    private boolean isSymmetric(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
        return (t1.val == t2.val) && isSymmetric(t1.right,t2.left) && isSymmetric(t1.left,t2.right);
        
    }
}