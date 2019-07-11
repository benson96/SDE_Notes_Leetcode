/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        //corner case
        if(root == null)
            return true;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        return Math.abs(leftHeight-rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    
    private int getHeight(TreeNode root){
        int height;
        if(root == null)
            return 0;
        int left1 = getHeight(root.left);
        int right1 = getHeight(root.right);
        return height = Math.max(left1,right1)+1;
    }
}