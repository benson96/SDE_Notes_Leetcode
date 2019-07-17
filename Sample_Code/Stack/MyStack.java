//Design a Stack using LinkedList

class MyStack{

	public class MyStack<T>{

		//fields
		private ListNode<T> head;

		//methods
		public MyStack(){
			head = null;
		}

		public void push(T item){
			ListNode<T> newNode = new ListNode<T>(item);
			newNode.next = head;
			head = newNode;
		}


		public T pop(){

			if (head == null){
				return null;
			}

			ListNdoe<T> popNode = head;
			head = head.next;
			popNode.next = null;
			return popNode.item;

		}


		public T peek(){
			return head == null? null : head.item;
		}
		

	}
}