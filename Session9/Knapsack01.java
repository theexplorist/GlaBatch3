package Session9;

import java.util.Arrays;

public class Knapsack01 {

	//curr, bagC
	private static int sol(int curr, int n, int[] wt, int[] price, int bagC, int[][] dp) {
		// TODO Auto-generated method stub

		if(bagC == 0 || curr == n) {
			return 0;
		}
		
		if(dp[bagC][curr] != -1) {
			return dp[bagC][curr];
		}
		int c1 = 0, c2 = 0;
		
		if(wt[curr] <= bagC) {
			//In case of 0/N -> infinite supply, curr will remain unchanged
			c1 = price[curr] + sol(curr + 1, n, wt, price, bagC - wt[curr], dp);
		}
		
		c2 = sol(curr + 1, n, wt, price, bagC, dp);
		
		return dp[bagC][curr] = Math.max(c1, c2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int bagC = 11;
		int[] wt = {3, 2, 4, 5, 1};
		int[] price = {4, 3, 5, 6, 1};
		int[][] dp = new int[bagC + 1][n + 1];//curr -> n, bagC -> bagC
		for(int[] row : dp) {
			Arrays.fill(row, -1);
		}
		System.out.println(sol(0, n, wt, price, bagC, dp));
	}

}
