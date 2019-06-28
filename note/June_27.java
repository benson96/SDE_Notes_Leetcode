June 27
(Sorting Algorithm)

Q1. 如何理解排序算法的稳定性：


定义： 排序前后两个相等的数相对位置不变，则算法稳定。

稳定性好处：从一个键上排序，然后再从另一个键上排序，第一个键排序的结果可以为第二个键排序所用。



各排序算法的稳定性：

1.） heap sort, quick sort, hell sort, selection sort is not stable
2.） radix sort, bubble sort, merger sort is stable:


Q2： Sort 的本质是什么？

	based on? Priority

	Priority can be defined by? compartor

Q3: 不同数据结构：
	arr.length
	str.length
	list.size()




Summary：

一. bubble sort:

1. 小的元素往前调或者把大的元素往后调；
2. 比较相邻的两个元素， 交换也发生在这两个元素之间
3. 稳定


二. selection Sort

1. 每个位置选择当前元素最小的
2. 在一趟选择中， 如果当前元素比一个元素小，而该小的元素又出现在和当前元素相等的元素后面，那么交换后稳定性就被破坏
3. e.g.: 序列 5 8 5 2 9， 我们知道第一遍选择第1个元素5会和2交换， 那么原序列中2个5的相对前后顺序就被破坏了
4. So, 不稳定

三. Insertion Sort.

1. 已经有序的小序列的基础上， 一次插入一个元素；

2. 想要插入的元素和已经有序的最大者开始比起，如果比它大则直接插入在其后面，否则一直往前找直到找到它该插入的位置；

3、如果碰见一个和插入元素相 等的，那么插入元素把想插入的元素放在相等元素的后面；

4、相等元素的前后顺序没有改变；

5、稳定排序算法。



四. Quick Sort.

1、两个方向，左边的i下标一直往右走，当a[i] <= a[center_index]，其中center_index是中枢元素的数组下标，一般取为数组第0个元素。而右边的j下标一直往左走，当a[j] > a[center_index]；

2、如果i和j都走不动了，i <= j, 交换a[i]和a[j],重复上面的过程，直到i>j；

3、交换a[j]和a[center_index]，完成一趟快速排序；

4、在中枢元素和a[j]交换的时候，很有可能把前面的元素的稳定性打乱，比如序列为 5 3 3 4 3 8 9 10 11， 现在中枢元素5和3(第5个元素，下标从1开始计)交换就会把元素3的稳定性打乱；

5、不稳定发生在中枢元素和a[j] 交换的时刻；

6、不稳定的排序算法。



五、Merge Sort

1、把序列递归地分成短序列，递归出口是短序列只有1个元素(认为直接有序)或者2个序列(1次比较和交换),然后把各个有序的短序列合并成一个有序的长序列，不断合并直到原序列全部排好序；

2、合并过程中我们可以保证如果两个当前元素相等时，我们把处在前面的序列的元素保存在结 果序列的前面，这样就保证了稳定性；

3、稳定排序算法。



六. Shell Sort

1、按照不同步长对元素进行插入排序；

2、当刚开始元素很无序的时候，步长最大，所以插入排序的元素个数很少，速度很快；

3、当元素基本有序了，步长很小， 插入排序对于有序的序列效率很高；

4、所以，希尔排序的时间复杂度会比o(n^2)好一些

由于多次插入排序，我们知道一次插入排序是稳定的，不会改变相同元 素的相对顺序，但在不同的插入排序过程中，相同的元素可能在各自的插入排序中移动，最后其稳定性就会被打乱；

5、不稳定的排序算法。



七. Radix Sort

1、按照低位先排序，然后收集；再按照高位排序，然后再收集；依次类推，直到最高位；

2、有时候有些属性是有优先级顺序的，先按低优先级排序，再按高优 先级排序，最后的次序就是高优先级高的在前，高优先级相同的低优先级高的在前；

3、用于整数；

4、需要较多的存储空间；

5、基于分别排序，分别收集；

6、稳定排序算法。



八、 Heap sort

1、是选择排序的一种；

2、堆的结构是节点i的孩子为2*i和2*i+1节点，大顶堆要求父节点大于等于其2个子节点，小顶堆要求父节点小于等于其2个子节点，是完全二叉树；

3、在一个长为n 的序列，堆排序的过程是从第n/2开始和其子节点共3个值选择最大(大顶堆)或者最小(小顶堆),这3个元素之间的选择当然不会破坏稳定性。但当为n /2-1, n/2-2, …1这些个父节点选择元素时，就会破坏稳定性。有可能第n/2个父节点交换把后面一个元素交换过去了，而第n/2-1个父节点把后面一个相同的元素没 有交换，那么这2个相同的元素之间的稳定性就被破坏了；

4、不稳定的排序算法。