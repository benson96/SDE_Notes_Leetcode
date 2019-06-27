/*
Given a sorted array with possibly duplicate elements
The task is to find indexes of first occurrences of an element x in the given array.

 EXAMPLES:

	Input : arr[] = {1, 3, 5, 5, 5, 5 ,67, 123, 125}    
        x = 5
	Output : First Occurrence = 2
    
	Input : arr[] = {1, 3, 5, 5, 5, 5 ,7, 123 ,125 }    
        x = 7
	Output : First Occurrence = 6
  
*/

public class FirstPosition{
	public int firstPosition(int[] array, int target){

		//corner case:
		if (array == null || array.length() == 0){
			return -1;
		}

		while (left + 1 < right){
			
			int mid = left + (right - left)/2;

			if (array[mid] == target){
				right = mid;
			}else if (array[mid] < target){
				left = mid;
			}else{
				right = mid;
			}
		}

		//post-processing
		if(array[left] = target)
			return left;
		if(array[right] = target)
			return right;
		return -1
	}
}
