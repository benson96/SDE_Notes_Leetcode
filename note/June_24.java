June 24

Session 1:

Binary Search (Tree) & Binary Reduction

本质： reduce half of current size -> binary search tree

狭义的： int
广义的： api


relation to Binary Search Tree: 压扁后的BST.

pre-processing

while (classical binary search)

post-processing


Classical Binary Search Template


S1: left <= right (right,left) +1  -1

S2: left <  right (left == right)

S3: left + 1 <  right (left, right ) better


S1: 

class Solution {
    public int search(int[] nums, int target) {

    	int left = 0;
    	int right = nums.length-1;
    	

    	while (left <= right){
    		int mid = left + (right - left)/2;
    		if (nums[mid] == target){
    			return mid;
    		}else{
    			if (nums[mid] > target){
    				right = mid -1;
    			}else{
    				left = mid +1;
    			}

    		}

    	}return -1;
    }
}

问题1： Why int mid = left + (right - left)/2 is better?

问题2： Why  int mid = left + (right - left)/2  不能放在 While 外面？

S3:

class Solution {
    public int search(int[] nums, int target) {

    	int left = 0;
    	int right = nums.length-1;



    	while (left +1 < right){
    		int mid = left + (right - left)/2;

    		if (nums[mid] == target){
    			return mid;
    		}else{
    			if(target < nums[mid]){
    				left = mid;
    			}else{
    				right = mid;
    			}



    	}


    	return -1
    }

}
