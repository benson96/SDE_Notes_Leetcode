/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class PreOrder{

	public List<Integer> preOrderTraversal(TreeNode root) {

		List<Integer> value = new ArrayList<Integer>();


		//corner case:

		if(root == null){
			return value;
		}

		preOrderTraversal(root, value);
		return value;

	}

	private void preOrderTraversal(TreeNode root, List<Integer> value){
		if(root != null){
			values.add(root.val);
			preOrderTrversal(root.left, value);
			preOrderTrversal(root.right, value);
		}

	}



}