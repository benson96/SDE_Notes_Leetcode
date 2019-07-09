/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*

Leetcode 92:
Reverse a linked list from position m to n. Do it in one-pass.

Note: 1 ≤ m ≤ n ≤ length of list.

Example:

Input: 1->2->3->4->5->NULL, m = 2, n = 4
Output: 1->4->3->2->5->NULL
*/


class ReverseLinkedListII{

	    public ListNode reverseBetween(ListNode head, int m, int n) {
        //corner case
        if (head == null) {
            return null;
        }
        /*
        int l = Math.abs(m-n);
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0 ; i < m; i++){
           current = current.next;
        }
        
        
        
        for (int i = 0 ; i <= l ; i++){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        */
        //move the two pointers until they reach the proper starting point
        
        ListNode cur = head;
        ListNode prev = null;
        while(m>1){
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }
        
        ListNode con = prev;
        ListNode tail = cur;
        ListNode third = null;
        
        while(n>0){
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            n--;
        }
        
        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        
        return head;



	}




}