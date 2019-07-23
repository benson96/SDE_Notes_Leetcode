/*
LeetCode 191

Number Of 1 Bits

Write a function that takes an unsigned integer and returns te numeber of '1' bits it has

(Known as Hamming Weight)

Example 1:

Input: 00000000000000000000000000001011
Output: 3
Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.

Example 2:

Input: 00000000000000000000000010000000
Output: 1
Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.

Example 3:

Input: 11111111111111111111111111111101
Output: 31
Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.


*/

class NumOfBits{


	// S1:<<
	public int hammingWeight1(int n) {

		int mask = 1;
		int count = 0;

		for(int i = 0; i < 32; i++){

			if((n & (mask << i)) != 0){
				count ++;
			}
		}
		return count;
	}


	// S2: >>> right shift with zero filled

	public int hammingWeight2(int n) {

		int count = 0;
		for (int i = 0; i < 32; i++) {
			if ((1 & n) != 0) 
				count++;
			n >>>= 1;  
		}
	return count;
	}


	//S3: 

	public int hammingWeight3(int n){

		int count = 0;

		while ( n != 0 ){

			if ( (n & 1) != 0) {
				count++;
			}
			n >>>= 1;
		}
		return count;
	}
}