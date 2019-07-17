
//Design a Queue using array with certain capacity.
//offer() -> tail++
//poll() -> head++
//peek() -> array[head]

public class ArrayQueue<E> {
	private E[] array;
	private int head;
	private int tail;
	private int size;

	private static final int DEFAULT_CAPACITY = 10;

	public ArrayQueue(int capacity) {
		array = new E[capacity];
		head = 0;
		tail = 0;
		size = 0;
	}

	public ArrayQueue() {
		this(DEFAULT_CAPACITY);
	}
	
	public boolean offer(E val) { //TODO: Expand

		if (size == array.length) 
			return false;
		
		array[tail] = val;

		tail = (tail + 1) % array.length;
		
		size++;

		return true;
	}

	public E poll() {

		if (size == 0) 
			return null;

		E res = array[head];

		head = (head + 1) % array.length;

		size--;
		return res;
	}

	public E peek() {
		return size == 0 ? null : array[head];
	}
}

