class IntersectionTwoLinkedList{

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode t1 = headA;
        int length1 = 1;
        while(t1 != null){
        	length1 ++;
        	t1 = t1.next;
        }
    }


    	ListNode t2 = headB;
    	int length2 = 1;

    	while(t2 != null){
    		length2 ++;
    		t2 = t2.next;
    	}


    	int dif = Math.abs(length2 - length1);

    	if (length1 < length2){
    		for(int i = 0 ; i < dif; i++){
    			headB = headB.next;
    		}
    	}else{
    		for(int i = 0 ; i < dif; i++){
    			headA = headA.next;
    		}
    	}

    	while (headA != headB){

    		headA = headA.next;
    		headB = headB.mext;
    	}

    	return headA;




}