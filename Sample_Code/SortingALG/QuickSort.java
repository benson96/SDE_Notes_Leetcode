// Quick Sort
/*
	主要思路：

	1. 先从数列中取出一个数作为基准数
	2. 分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边
	3. 再对左右区间重复第二步，直到各区间只有一个数

	概括来说： 挖坑填数 + divide and conquer!

*/
// Two Method


public class QuickSort{


	public int[] quickSort1(int[] array){
		if (array == null || array.length <=1 }{
			return array;
		}

		//overloading here

		quickSort1(array, 0, array.length -1);

		return array;
	}


	private void quickSort1 (int[] array, int left,  int right){

		//recursion base case

		if (left >= right){
			return;
		}

		// find pivot position and do partition
		int privotIndex = findPosPartition(array, left, right);
		quickSort1(array, left, pivotIndex - 1);
		quickSort1(array, pivotIndex +1, right);

	}

	private int findPosPartition(int[] array, int left, int right){
		int pivotRandIndex = left + (int)Math.random()*(right - left +1);

		int pivotValue = array[pivotRandIndex];

		swap(array, pivotRandIndex, right);


		//******************Different Start ************************

		int leftI = left;
		int rightI = right -1; //array[right] is now the pivot


		while (leftI <= rightI){

			if (array[leftI] < pivotVaule){
				leftI++;
			}else if (array[rightI] >= pivotVaule){
				rightI--;
			}else{
				swap(array, leftI++,rightI--);
			}


		}

		swap(array,leftI,right);
		return leftI;
		// **************************different end**********************
	}

	private void swap(int[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}


	// S2: two pointer forward, stable

	int slow = left;
	int fast = left;

	while (fast <= right){
		if (array[slow] < pivotVaule){
			slow++;
		}

		if (array[fast] < pivotValue){
			swap(array,slow,fast);
			slow++
		}
		fast++;
	}
	return slow;
}