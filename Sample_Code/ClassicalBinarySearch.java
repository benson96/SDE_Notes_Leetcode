/* Key point:

	1. why we use left + (right -left)/2

	Avoid stack overflow

	e.g.: 2^-31 ------  2^31

	2. corner case:

	why array == null is on the left of array.length == 0 ?


	3. When to use S1 or S2?

		找index， 用S1
		找分界位置，用S3

*/
public class ClassicBinarySearch{

	//S1: left <= right

	public int binarySearch1(int[] array, int target){

		//corner case

		if(array == null || array.length == 0){
			return -1;
		}

		int left = 0;

		int right = array.length -1;

		while(left <= right){

			int mid = left + (right - left)/2;

			if(array[mid] == target){
				return mid;
			}else if (array[mid] == target){
				left = mid + 1;
			}else{
				right = mid - 1;
			}
		}
		return -1
	}



	//S2: left + 1 < right
	public int binarySearch2(int[] array, int target){

		//corner case:

		if(array == null || array.size() == 0 ){
			return -1;
		}

		int left = 0;

		int right = array.length -1;

		while ( left + 1 < right){

			int mid = left + (right - left)/2;

			if (array[mid] == target){
				return mid;
			}else if (array[mid] < target){
				left = mid;
			}else{
				right = mid;
			}

		//post_processing

		if (array[left] == target)
			return left;

		if (array[right] == target)
			return right;

		return -1;

		}
	}
}