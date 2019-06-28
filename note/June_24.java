June 24

Session 1:

Binary Search (Tree) & Binary Reduction

本质： reduce half of current size -> binary search tree

狭义的： int
广义的： api


relation to Binary Search Tree: 压扁后的BST.

pre-processing

while (classical binary search)

post-processing


Classical Binary Search Template


S1: left <= right (right,left) +1  -1

S2: left <  right (left == right)

S3: left + 1 <  right (left, right ) better


S1: 

class Solution {
    public int search(int[] nums, int target) {

    	int left = 0;
    	int right = nums.length-1;
    	

    	while (left <= right){
    		int mid = left + (right - left)/2;
    		if (nums[mid] == target){
    			return mid;
    		}else{
    			if (nums[mid] > target){
    				right = mid -1;
    			}else{
    				left = mid +1;
    			}

    		}

    	}return -1;
    }
}

问题1： Why int mid = left + (right - left)/2 is better?

问题2： Why  int mid = left + (right - left)/2  不能放在 While 外面？

S3:

class Solution {
    public int search(int[] nums, int target) {

    	int left = 0;
    	int right = nums.length-1;



    	while (left +1 < right){
    		int mid = left + (right - left)/2;

    		if (nums[mid] == target){
    			return mid;
    		}else{
    			if(target < nums[mid]){
    				left = mid;
    			}else{
    				right = mid;
    			}



    	}


    	return -1
    }

}
    
    
How to practice:
IDE：不知道怎么写代码
Google Doc: bug free 电面
Code edit: 电面
HackerRank/CoderPen/CoderPad: OA / 电面
白板写code: onsite


How to solve a problem:
First Level: 	Just know the answer
Second Level: Time and space(data structure selection) complexity
Third Level: 	Approach summary
Fourth Level: 	Similar problem
Fifth Level:	Merge sort vs quick sort
Time
Space
extra space but stable
not stable but win
    
Most popular data structure you may use in interview?
1. Array/String: Binary Search, Sorting, Two pointers, String to char[] / CharAt() / slow fast, DP
2. List: ArrayList + LinkedList + dummy
3. Queue: LinkedList, FIFO, BFS, Level Order → PriorityQueue(Heap)
4. Stack: LinkedList, FILO, DFS, pre/in/post order traversal, iteration(stack) (while), 单调序列
5. Heap: logical tree, array, complete, order, parent, left, right, PriorityQueue BFS
6. HashMap/HashSet/HashTable: key value, array, O(1) get(key) hashcode + array, collision, load factor(0.75)
7. Tree: traversal, recursion, iteration, divide & conquer, TreeNode
8. Graph: BFS(+visited + Heap) vs DFS(+visited) → Dijistra's Algrorithm
9. Trie: Prefix → n branch tree
10. Union Find   Topological Sort   Interval   BDFS + Pruning + DP + Iterator + Segment Tree + B+ Red

