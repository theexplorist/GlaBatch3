package Session8;

import java.util.Arrays;

public class HouseRobber {

	private static int maxP(int[] nums, int curr, int n, int[] cache) {
		// TODO Auto-generated method stub

		if(curr >= n) {
			return 0;
		}
		
		if(cache[curr] != -1) {
			return cache[curr];
		}
		int rob = nums[curr] + maxP(nums, curr + 2, n, cache);
		int dontRob = maxP(nums, curr + 1, n, cache);
		
		return cache[curr] = Math.max(rob, dontRob);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,7,9,3,1};
		int n = nums.length;
		int[] cache = new int[n + 1];

		Arrays.fill(cache, -1);
		System.out.println(maxP(nums, 0, n, cache));
		
	}

}
