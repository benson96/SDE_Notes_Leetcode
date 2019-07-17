/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root){

	List<List<Integer>> result = new ArrayList<List<Integer>>();

	if (root == null){
		return result;
	}

	Queue<TreeNode> queue = new LinkedList<TreeNode>();

	queue.offer(root);
	while(!queue.isEmpty()){
		int size = queue.size();
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < size; i++){

			TreeNode node = queue.poll(); 
			list.add(node.val);
			if(node.left != null){
				queue.offer(node.left);
			}
			if(node.right != null){
				queue.offer(node.right);
			}
		}
		result.add(list);
	}
	return result;
}