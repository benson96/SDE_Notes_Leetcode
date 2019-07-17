//Design a Queue using double LinkedList

	public class MyQueue<T>{
		//fields
		private ListNode<T> head;
		private ListNode<T> tail;
		int length;

		//methods
		public MyQueue(){
			head = null;
			tail = null;
			length = 0;
	}

		public void offer(T val){

			/*
			ListNode<T> newNode = new ListNode<>();

			if(head == null){
				head = newNode;
				tail = newNode;
			}else{
				newNode.prev = tail;
				tail.next = newNode;
				newNode.prev = tail;
			}
			tail = newNode;
			*/

			if(tail == null){
				tail = new ListNode<>(val);
				head = tail;
			}else{
				ListNode<E> newTail = new ListNode<>(val);
				tail.next = newTail;
				newTail.prev = tail;
				tail = newTail;
			}
			length++;
		}


		public T poll(){

			if(head == null)
				return null;

			ListNode<T> temp = head;

			if(head == tail){
				head = null;
				tail = null;
			}else{
				head = head.next;
				head.prev = null;
				temp.next = null;
			}

			length--;

			return temp.val;

		}

		public T peek(){

			return head == null? null : head.val;

		}
	}