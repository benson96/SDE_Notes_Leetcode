// Design a Stack using Array with certain capacity
// head
// push -> assign head++
// pop -> head--
// peek -> array[head - 1]
// [0,head)
// [0,head]

public class MyStack2<T>{

	private T[] array;
	private int head;

	public MyStack2(int c){
		array = new T[c];
		head = 0;
	}


/*
	why we need offer?

	public boolean offer(T val){

	}

*/

	public boolean push(T val){
		if(head >= array.length - 1)
			return false;

		array[head++] = val;
		return true;

	}


	public T pop(){
		if(size == 0)
			return null;

		return array[head--];


	}



	public T peek(){
		return size == 0 ? null : array[head - 1];
	}



}