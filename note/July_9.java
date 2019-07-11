Session 5 Binary (Search) Tree & Divide Conquer


Tree: depth or Height = numbers of level

Binary Tree --> n-ary tree

For every node, at most two  children without cycle --> DAG (DIRECTED ACYCLIC Graph)

class TreeNode{  //Todo Generics:

	int val; //data
	TreeNode left;
	TreeNode right;

	TreeNode(int x){
		this.val = x;
		null;
	}

}


1. Binary Tree:

	For every node x, 
	all node's value in the left subtree should be less than to root x's value,
	all node's value in the right subtree should be greater than to root x's value.

2. Complete Binary Tree 

	For every level, 
	except the last level, 
	it should be filled completely (full binary tree),
	last level should be filled as left as possible.

3. Balanced Binary Tree:

	For every node,
	the height difference between left subtree and right subtree should not be greater than one.


4.                15

		5					20

	3		6			17		23

	Preorder:   15 5  3  6   20  17  23
	inOrder:    3  5  6  15  17  20  23
	PostOrder:  3  6  5  17  23  20  15

	Preorder:

	private void preOrder (TreeNode root){

		if(root == null)
			return;

		System.out.print(root.val + " ")
		preOrder(root.left);
		preOrder(root.right);
	}


	Q1 Leetcode 144, 94, 145

		Tree Traversal: preOrder, inOrder, PostOrder

		Recursion + Interation solutions:


	Q2 Leetcode 104: Maximum Depth of Binary Tree

	   Leetcode 111: Minimum Depth of Binary Tree


	Q3 Leetcode 110: Balanced Binary Tree


	Q4 Leetcode 101: Symmetric Tree

	   Leetcode 226: Invert Binary Tree


	Q5 Leetcode 100: Same Tree
	   Leetcode 572: check small binary tree is part/subtree of larger binary tree.

