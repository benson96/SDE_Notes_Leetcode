/*
LeetCode 876:

Given a non-empty, singly linked list with head node head, 
return a middle node of linked list.

If there are two middle nodes, return the second middle node.

example 1:

Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.


example 2：

Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
Since the list has two middle nodes with values 3 and 4, we return the second one.

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


class MiddleNode{

	//S1: SLOW FAST POINTER
	public ListNode middleNode1(ListNode){

			ListNode slow = head;
			ListNode fast = head;

			while(fast!= null && fast.next != null){
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
	}




	//S2: Put every node into an array A in order.
	//Then the middle node is just A[A.length/2]


	public ListNode middleNode2(ListNode){
		ListNode[] A = new ListNode[100];
		int t = 0;
		while(head.next != null){
			A[t++] = head;
			head = head.next;
		}
		return A[t/2];
	}

}