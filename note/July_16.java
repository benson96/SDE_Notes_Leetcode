Session 7


1. Java Basics

List ArrayList LinkedList

Abstract class vs interface


2. 数据结构间的相互实现

	1. Design a Stack using LinkedList

	1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NullPointerException
	head

	public class MyStack{
		//
		head

		// 
		MyStack(){

		}
		push()
		pop()
		peek()
	}


3. Design a Queue using double LinkedList

	public class MyQueue{
		//fields
		head tail
		//methods
		MyQueue()

		offer()
		poll()
		peek()
	}



4. Design a Queue using Array with certain Capacity



5. Design a Stack using Array with certain Capacity


6. Design Stack/Queue/Deque using Array/LinkedList/ArrayList




Session 8: BFS & Dijkstra & DFS(backtracing)

搜索/ 遍历算法 -> all possible solutions


1. BFS

Breadth First Search

Using queue for BFS:

Step1: push root
Step2: expand/queue.poll()/visit/print/add to result
Step3: generate(convert) neighbours and push into queue

how to exit our while loop?

queue is empty.


Q1: LeetCode 102 Binary Tree Level Order Traversal

	Q1.1 do it by DFS
	Q1.2 Leetcode 107 do it by bottom Up 
	Q1.3 Leetcode 314 Binary Tree Vertical Order Traversal
	Q1.4 Level Order Traversal from right to Left 
	Q1.5 Leaf nodes order traversal

				  15 (root)    q1
		   /		          \

		5	                   20     q2
   /        \             /        \

3	         10         17            23   q1


public void levelOrderTraversal1(TreeNode root){

	if(root == null){
		return;
	}

	Queue<TreeNode> que = new LinkedList<>();

	que.offer(root);

	while(!que.empty()){
		TreeNode pollNode = que.poll();
		System.out.print(pollNode.value);
		if(pollNode.left != null){
			que.offer(pollNode.left);
		}
		if(pollNode.right != null){
			que.offer(pollNode.right);
		}
	}
}

// 15 5 20 3 16 17 23


public void levelOrderTraversal2(TreeNode root){
	if(root == null){
		return;
	}

	Queue<TreeNode> que = new LinkedList<>();
	que.offer(root);
	while(!que.empty()){
		for(int i = 0; i < que.size(); i++){
			TreeNode pollNode = que.poll();
			System.out.print(pollNode.value);
			if(pollNode.left != null){
				que.offer(pollNode.left);
			}
			if(pollNode.rigt != null){
				que.offer(pollNode.right);
			}
		}
		System.out.println()
	}
}


public List<List<Integer>> level(TreeNode root){

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