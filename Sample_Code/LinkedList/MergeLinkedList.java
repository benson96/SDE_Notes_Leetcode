/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeLinkedList {

	//S1: using dummy node
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {

    	
        
    }




    //S2:  using recursion. 
    //新建一个头节点，不断拿两个链表的节点比较，谁小就链接上去。

    public ListNode mergeTwoLists2(ListNode L1, ListNode l2){
    	if(l1 == null)
    		return l2;
    	if(l2 == null)
    		return l1;

    	ListNode resultHead;

    	if(L1.val < L2.val){
    		resultHead = L1;
    		resultHead.next = mergeTwoLists(L1.next,L2);
    	}else{
    		resultHead = L2;
    		resultHead.next = mergeTwoLists(L1,L2.next);
    	}

    	return resultHead;
    }
}




