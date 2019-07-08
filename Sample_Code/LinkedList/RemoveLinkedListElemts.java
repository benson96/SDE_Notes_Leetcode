/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        //corner case::

    	if(head == null){
    		return null;
    	}

    	ListNode cur = head;

        while (cur.next != null){

        	if(cur.next.val == val){
        		cur.next = cur.next.next;
        	}else{
        		cur = cur.next;
        	}

        }



        //if head node has the value we want to remove, 
        //return the head.next as head!
        if(head.val == val){
        	return head.next;
        }

        return head;


    }
}