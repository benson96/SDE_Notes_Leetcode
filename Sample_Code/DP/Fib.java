public class Fib{
	
	//S1: recursion

	public long fib1(int n){

		if(n<=0){
			return 0;
		}

		if(n==1){
			return 1;
		}

		return fib1(n-1)+fib1(n-2);
	}
	
	//S2: dp with O(n) space

	public long fib2(int n){

		if (n<=0){
			return 0;
		}

		long[] array = new long(n+1);
		array[0] = 0;
		array[1] = 1;

		for (int i = 2; i <= n; i++){
			array[i] = array[i-1]+array[i-2];
		}

		return array[n];

	}


	// S3: dp with O(1) space

	public long fib3(int n){
		if(n<=0){
			return 0;
		}

		long pprev = 0;
		long prev = 1;

		while (n>1){
			long temp = prev + pprev;
			pprev = prev;
			prev = temp;
			n--;
		}
		return prev;
	}
}