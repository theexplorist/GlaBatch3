package Session8;

import java.util.Arrays;

public class ClimbingStairsWays {

	private static int sol(int curr, int n, int[] cache) {
		// TODO Auto-generated method stub

		if(curr == n) {
			return 1;
		}
		if(curr > n) {
			return 0;
		}
		if(cache[curr] != -1) {
			return cache[curr];
		}
		int c1 = sol(curr + 1, n, cache);
		int c2 = sol(curr + 2, n, cache);
		
		return cache[curr] = c1 + c2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		
		int[] cache = new int[n + 1];
		Arrays.fill(cache, -1);
		System.out.println(sol(0, n, cache));
		
	}

}
