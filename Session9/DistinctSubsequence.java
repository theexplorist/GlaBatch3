package Session9;

import java.util.Arrays;

public class DistinctSubsequence {

	//currS -> s.length, currT -> t.length
	private static int sol(String s, String t, int currS, int currT, int[][] dp) {
		// TODO Auto-generated method stub

		if(currT == t.length()) {
			return 1;
		}
		
		if(currS == s.length()) {
			return 0;
		}
		
		if(dp[currS][currT] != -1) {
			return dp[currS][currT];
		}
		int pick = 0;
		if(s.charAt(currS) == t.charAt(currT)) {
			pick = sol(s, t, currS + 1, currT + 1, dp);
		}
		
		int dontPick = sol(s, t, currS + 1, currT, dp);
		return dp[currS][currT] =  pick + dontPick;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "rabbbit";
		String t = "rabbit";
		
		int[][] dp = new int[s.length() + 1][t.length() + 1];
		for(int[] row : dp) {
			Arrays.fill(row, -1);
		}
		
		System.out.println(sol(s, t, 0, 0, dp));
	}

}
