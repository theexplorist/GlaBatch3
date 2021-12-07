package Session11;

public class MinFallingPathSum2 {

	public int minFallingPathSum(int[][] matrix) {
        int ansMin = Integer.MAX_VALUE;
        for(int c = 0; c < matrix[0].length; c++) {
            int ans = sol(matrix, 0, c);
            ansMin = Math.min(ansMin, ans);
        }
        
        return ansMin;
    }
    
    private int sol(int[][] cost, int cr, int cc) {
		// TODO Auto-generated method stub

		if(cr == cost.length - 1) {
			return cost[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int c = 0; c < cost.length; c++) {
			if (cc != c) {
				ans = Math.min(ans, sol(cost, cr + 1, c));
			}
		}
		
		return ans + cost[cr][cc];
	}
}
