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

3. Interface vs Implementation vs class 


	<1> 