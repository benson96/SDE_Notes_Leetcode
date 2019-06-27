/*
a ? b :c = if a then b else c

a is a statement!

*/

public class ClosestPosition{

	//corner case
	if(array == null || array.length() == 0){
		return -1;
	}

	int left = 0;
	int right = array.length()-1;

	while (left + 1 < right){

		int mid = left + (right - left)/2

		if(array[mid] == target){
			return mid;
		}else if (array[mid] < target){
			left = mid;
		}else{
			right = mid;
		}
		//post-processing:
		return Math.abs(nums[left] - target) < Math.abs(nums[right]-target)? left: right;
	}
}