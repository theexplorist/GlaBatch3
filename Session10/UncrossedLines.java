package Session10;

import java.util.Arrays;

public class UncrossedLines {

	//currS(s.length), currT(t.length) -> 2D
		private static int sol(int[] s, int[] t, int currS, int currT, int[][] dp) {
			// TODO Auto-generated method stub

			if(currS == s.length || currT == t.length) {
				return 0;
			}
			
			if(dp[currS][currT] != -1) {
				return dp[currS][currT];
			}
			if(s[currS] == t[currT]) {
				return dp[currS][currT] =  sol(s, t, currS + 1, currT + 1, dp) + 1;
			} else {
				int c1 = sol(s, t, currS, currT + 1, dp);
				int c2 = sol(s, t, currS + 1, currT, dp);
				
				return dp[currS][currT] = Math.max(c1, c2);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] s = {2,5,1,2,5};
		int[] t = {10,5,2,1,5,2};
		
		int[][] dp = new int[s.length + 1][t.length + 1];
		for(int[] row : dp) {
			Arrays.fill(row, -1);
		}
		System.out.println(sol(s, t, 0, 0, dp));
	}

}
