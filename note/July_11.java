July 11

Q1: LeetCode 98: Validate Binary Search Tree

	3 solutions


Q2: LintCode 11: Search Range in Binary Search Tree
/*
	public void searchRange(TreeNode root, int k1, int k2){
		if(root == null)
			return;

		TreeNode left = searchRange(root.left);

	}

*/

Q3: LeetCode 270: Closest Binary Search Tree Value
	
	similar to closest value using binary search
/*

	public int closetValueOfBST(TreeNode root, int target){
		if(root == null)
			return root;
		TreeNode current = root;
		while(current != null){
			if(current.val == target ){
				return current;
			}else if(){
				current current.left
			}
		}
	}

*/

Q4 Binary Search Tree vs Binary Search



Session 6 Heap, Graph and HashMap

JAVA中
Heap 的实现是 PriorityQueue
Heap 的逻辑结构 是 Tree
Heap 的存储结构 是 UNSORTED ARRAY in memory.

1. heap order? Min Heap/ Max Heap
2. heap is always a complete binary Tree
3. You can only access the top node when you use It
4. insert(push/offer/add) pop(poll/delete/remove) get update/put
5. initialize heapify.

heapify O(n) convert an unsorted array to Tree

insert() O(logn)
delete() O(logn) -> remove()
update() O(logn) -> delete() insert()
get() O(1)

6. Given an element with index x in the unsorted array.

parent (x-1)/2
Lchild 2x + 1
Rchild 2x + 2


Q1 LeetCode 215: Kth smallest to largest element in an unsorted array

Q1.1 Smallest K elements in an unsorted array; sorted/unsorted output


	4 methods to solve the problem

	1. Sort and return Kth element, time O(nlogn) (modified quickSort)
	2. Quick Selection / QuickSort Partition + Binary Search
	3. MinHeap --> size n

	   Step 1: nlogn one by one --> heapify the whole inout array O(n)
	   Step 2: keep pop out k times O(klogn)
	   Time O(n + k logn)
	   Space O(n)

	4. MaxHeap --> size k

		Step 1: heapify the first k elements from input array O(k)
		Step 2: loop the remaining elements, 
				if value of the element x is smaller thant the heap top,
				delete and insert x into the heap  O((n-k)log k)

			Time O(k+(n-k)logk)
			Space O(k)