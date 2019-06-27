//Merge Sort


public class MergeSort {


	// S1: CARRY ON HELPER ARRAY
	// CARRY ON THE SAME SIZE HELPER ARRAY DURING RECURSION, 
	// Space O(n)

	public int[] mergeSort1(int[] array){

		//corner case/ Edge case / Base case: check null and other, order matters!
		if(array == null || array.length = 0){
			return array;
		}


		int[] helper = new int[array.length];

		//method overloading

		mergeSort1(array, helper, 0, array.length-1);

		return array;
	}

	private void mergeSort1(int[] array, int[] helper, int left, int right){

		//recursion base case

		if(left == right){
			return;
		}

		int mid = left + (right - left) /2;

		







	}

















}