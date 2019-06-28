// Merge Sort
// TWO METHODS!
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

		mergeSort1(array,helper,mid+1,right);
		mergeSort1(array,helper,mid+1,right);
		merge1(array,helper,left,mid,right);
	}

	private void merge1(int[] array, int[] helper, int left, int mid, int right){

		// reference not primitive type to pass array,
		// so prepare helper data in [left, right] from array


		for(int i = left; i <= right; i++){
			help[i] = array[i];
		}

		int leftI = left;
		int rightI = mid +1;

		while (leftI <= mid && rightI <= right){

			if(help[leftI]<helper[leftI++]){
				array[left++] = helper[left++];
			}else{
				array[left++] = helper[rightI++];
			}
		}

		//remaining elements on left side

		while (leftI <= mid){
			array[left++] = helper[leftI++];
		}

	}


	//S2: Use ArrayList:
	//Classical Merge Sort with new ArrayList each recursion level


	public ArrayList<Integer> mergeSort2 (ArrayList<Integer> array){

		if(array == null || array.size() <= 1){
			return array;
		}

		//method ovreloading
		return mergeSort2(array, 0, array.size()-1);
	} 

	private ArrayList<Integer> mergeSort2(ArrayList<Integer> array, int left, int right){

		if (left == right){

			ArrayList<Integer> Result = new ArrayList<Integer>();
			result.add(array.get(left));
			return result;
		}

		int mid = left + (right - left)/2;

		ArrayList<Integer> leftResult = mergeSort2(array,left,mid);
		ArrayList<Integer> rightResult = mergeSort2(array,mid+1,right);
		return merge2(leftResult, rightResult);
	}


	private ArrayList<Integer> merge2(ArrayList<Integer> leftResult, ArrayList<Integer> rightResult){


		ArrayList<Integer> result = new ArrayList<Integer>();

		int leftI = 0;
		int rightI = 0;
		while(leftI < leftResult.size() && rightI < rightResult.size()){

			if (leftResult.get[leftI] < rightResult.get[rightI]){
				result.add(leftResult.get[leftI++]);
			}else{
				result.add(rightResult.get[rightI++]);
			}
		}

		// remaining elements on left side
		while (leftI < leftResult.size()){
			result.add(leftResult.get[leftI++]);
		}

		// remaining elements on right side
		while (rightI < rightResult.size()){
			result.add(rightResult.get[rightI++]);
		}
		return result;
	}

}