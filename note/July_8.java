July 8:


1. Java Generics


2. ArrayList vs LinkedList

	<1> ArrayList 基于 数组
		LinkedList 基于 double linked List 
	<2> 对于随机访问，ArrayList 优于 LinkedList, ArrayList可以根据下标以O(1)时间复杂度对元素进行随机访问。
		而LinkedList的每一个元素都依靠地址指针和它后一个元素连接在一起，在这种情况下，查找某个元素的时间复杂度是O(n) .
	<3> 对于插入和删除操作，LinkedList优于ArrayList，
		因为当元素被添加到LinkedList任意位置的时候，不需要像ArrayList那样重新计算大小或者是更新索引。
	<4> LinkedList比ArrayList更占内存，因为LinkedList的节点除了存储数据，
		还存储了两个引用，一个指向前一个元素，一个指向后一个元素。

3. Stack and Queue:


	Stack:

	Linear structure: last in first out  

	只在 表尾 进行删除和操作

	特殊的线性表，
	但在操作上有特殊的要求和限制
	后进先出

	对于 stack, 表尾 称为 栈的栈顶 (TOP)
				表头 称为 栈底 (BOTTOM)

Modifier and Type		Method and Description

boolean					empty()
						Tests if this stack is empty.

E						peek()
						Looks at the object at the top of this stack without removing it from the stack.

E						pop()
						Removes the object at the top of this stack and returns that object as the value of this function.

E						push(E item)
						Pushes an item onto the top of this stack.

int						search(Object o)
						Returns the 1-based position where an object is on this stack.


Queue

First In First Out:

Modifier and Type			Method and Description
boolean						add(E e)
							Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.

E							element()
							Retrieves, but does not remove, the head of this queue.

boolean						offer(E e)
							Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.

E							peek()
							Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

E							poll()
							Retrieves and removes the head of this queue, or returns null if this queue is empty.

E							remove()
							Retrieves and removes the head of this queue.


4. Deque

双向队列

Methods of Deque:

add(element): Adds an element to the tail.

addFirst(element): Adds an element to the head.

addLast(element): Adds an element to the tail.

offer(element): Adds an element to the tail and returns a boolean to explain if the insertion was successful.

offerFirst(element): Adds an element to the head and returns a boolean to explain if the insertion was successful.

offerLast(element): Adds an element to the tail and returns a boolean to explain if the insertion was successful.

iterator(): Returna an iterator for this deque.

descendingIterator(): Returns an iterator that has the reverse order for this deque.

push(element): Adds an element to the head.

pop(element): Removes an element from the head and returns it.

removeFirst(): Removes the element at the head.

removeLast(): Removes the element at the tail.

poll(): Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.

pollFirst(): Retrieves and removes the first element of this deque, or returns null if this deque is empty.

pollLast(): Retrieves and removes the last element of this deque, or returns null if this deque is empty.

peek(): Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.

peekFirst(): Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.

peekLast(): Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.