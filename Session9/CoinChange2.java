package Session9;

import java.util.Arrays;

public class CoinChange2 {

	//curr, amount -> 2D
	private static int sol(int[] coins, int curr, int amount, int[][] dp) {
		// TODO Auto-generated method stub

		if(amount == 0) {
			return 1;
		}
		
		if(curr == coins.length) {
			return 0;
		}
		
		if(dp[curr][amount] != -1) {
			return dp[curr][amount];
		}
		int pick = 0; 
		if(coins[curr] <= amount) {
			pick = sol(coins, curr, amount - coins[curr], dp);
		}
		
		int dontPick = sol(coins, curr + 1, amount, dp);
		return dp[curr][amount] = pick + dontPick;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coins = {1, 2, 5};
		int n = coins.length;
		int amount = 5;
		int[][] dp = new int[n + 1][amount + 1]; //curr -> n, amount -> amount
		for(int[] row : dp) {
			Arrays.fill(row, -1);
		}
		
		System.out.println(sol(coins, 0, amount, dp));
	}

}
