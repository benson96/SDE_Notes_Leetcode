/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
**/

class MinDepth{


    public int minDepth(TreeNode root) {
        int min;
        
        //corner case:
        
        if(root == null){
            return 0;
        }
        
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0) 
            return right + 1;
        if (right == 0) 
            return left + 1;
        return min = Math.min(left,right) +1;
    }
}

