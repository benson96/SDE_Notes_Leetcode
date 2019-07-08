/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
Leetcode 234:
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true

*/





class PalindromeLinkedList{

	//s1: By reversiing the lise:
	//This method takes O(n) time and O(1) extra space;
	/*
	1) Get the middle of the linked list.
	2) Reverse the second half of the linked list.
	3) Check if the first half and second half are identical.
	4) Construct the original linked list by reversing the second half again and attaching it back to the first half
	*/
	public boolean isPalindrome(ListNode head) {

		ListNode fast = head;
		ListNode slow = head;
		ListNode temp = head;


		//corner case:

		if(head == null || head.next == null){
			return true;
		}

		//search for the mid
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}

		//reverse the list from slow.next


		ListNode temp1 = slow.next;
		slow.next = null;
		ListNode i = temp1;
		ListNode j = temp1.next;


		while(j!= null){
			i.next = j.next;
			j.next = temp1;
			temp1 = j;
			j = i.next;

		}

		slow.next = temp1;

		while (temp1 != null) {
			if (temp.val != temp1.val){
				return false;
			}
			temp = temp.next;
			temp1 = temp1.next;
		}

		return true;

        
    }






}