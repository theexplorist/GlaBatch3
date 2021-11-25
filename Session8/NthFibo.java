package Session8;

import java.util.Arrays;

public class NthFibo {

	private static long nthFibo(int n, long[] cache) {
		// TODO Auto-generated method stub

		//base case
		if(n == 0 || n == 1) {
			return n;
		}
		
		if(cache[n] != -1) {//overlapping
			return cache[n];
		}
		
		//rec works - 2
		long fibN_1 = nthFibo(n - 1, cache);//aman
		long fibN_2 = nthFibo(n - 2, cache); //rishabh
		
		//my work
		long fibN = fibN_1 + fibN_2;
		return cache[n] = fibN;//store
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 50;
		long[] cache = new long[n + 1];
		Arrays.fill(cache, -1);
		System.out.println(nthFibo(50, cache));
	}

}
