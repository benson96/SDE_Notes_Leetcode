public class MyPow{
	public long MyPow{int x, int n}{


		if (n == 0){
			return 1;
		}
		if (x == 0){
			return 0;
		}

		long half = myPow(x,n/2);

		return n%2 == 0 ? half* half : half*half*x;
	}
}