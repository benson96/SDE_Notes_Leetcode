/*
Given an integer, write a function to determine if it is a power of two.

Example 1:

Input: 1
Output: true 
Explanation: 20 = 1

Example 2:

Input: 16
Output: true
Explanation: 24 = 16

Example 3:

Input: 218
Output: false
*/
class PowerOf2{

	//S1： Recursion
	public boolean powerOfTwo1(int n){
		//corner case:

		if( n <= 0 ){
			return false;
		}

		if( n == 1 ){
			return true;
		}
		if( n%2 != 0){
			return false;
		}
		return powerOfTwo1(n/2);
	}


	//S2: 
	public boolean powerOfTwo2(int n){
		while(n>1){
			if(n%2 !=0){
				return false;
			}
			n = n/2;
		}

		return n == 1;
	}

	//S3: Mask;

	public boolean isPowerOfTwo(int n){
		long mask =1; //y用TEMP会Time Limit Exceeded
		while(mask < n){
			mask = mask*2;
		}
		return mask ==n;
	}



}