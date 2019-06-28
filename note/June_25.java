June 25

1. 如何理解JAVA中堆(heap)和栈(stack)内存

Java 把内存分为 2 种： heap and stack

Stack (栈)：
	存放基本类型的变量数据和对象的引用
	但对象本身不放在栈中，
	而是存放在堆 (new 出来的对象) 或者 常量池中

Heap (堆)：
	存放所有new出来的对象


2. Matrix Position of Target:

	Leetcode 74: Search a 2D Matrix

	Leetcode 240: Search a 2D Matrix II Quadrate Search


	S1: 
	primitive 2 times binary search (1st largest smaller=) 
	logm + logn


	S2: 
	int[][] matrix vs List<List<Integer>>
	rows = matrix.length
	cols = matrix[0].length

	matrix[0][0] → 0
	matrix[rows-1][cols-1] → rows * cols - 1
	array[mid] → matrix[mid / cols][mid % cols]







3. binary search 3 种套路
// (start, end)
start = 0; 
end = len - 1;
while(start + 1 < end) {
 	mid=start+(e-s)/2;
 	if(nums[mid]<target)
   		start = mid;
 	else
   		end = mid;
}

// start == end
start = 0; 
end = len;
while(start < end) {
 	mid=start+(e-s)/2;
 	if(nums[mid]<target)
   		start = mid  + 1;
 	else
   		end = mid;
}


// (end, start)
start = 0; 
end = len - 1;
while(start <= end) {
 	mid=start+(e-s)/2;
 	if(nums[mid]<target)
   		start = mid + 1;
 	else
   		end = mid - 1;
}

4. Unknown Size Position of Target --> streamming flow

	如何找边界：

	//example： 
	while (myArray.get(end) != null && myArray.get(end) < target) {
		start = end;
		end *= 2; 
	}

