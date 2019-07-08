/**
 * LeetCode 206
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


//3种方法
//1. dummy node
//2. iteratoin
//3. recursion


class ReverseLinkedList {
	//s1: interation
    public ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }




    //S2： recursion
    //先recursion 后办事

    public ListNode reverseLinkedList2(){

    }

}