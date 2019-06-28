public class MoveZeros{

	public int[] moveZeros1(int[] array){

		//corner case


		if(array == null || array.length <= 1){
			return array;
		}



		int right = array.length-1;
		int left = 0;


		while (left < right){

			if(array[left] !=  0){
				left++;
			}else if (array[right] == 0){
				right --;
			}else{
				swap(array,left++,right--);
			}
		}
		return array;



	}


	private void swap(int[] array, int i, int j){

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
	// 最后输出的不是Sort的


	public void moveZeros2(int[] nums){
		if (nums == null || nums.length == 0)
			return;
		int slow = 0;
		for(int fast = 0; fast < nums.length; fast++){
			if (nums[fast] != 0){
				nums[slow++] = nums[fast];
			}
		}

		while (slow < nums.length){
			nums[slow++] = 0;
		}
	}


}