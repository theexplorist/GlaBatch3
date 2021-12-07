package Session11;

public class MinFallingPathSum1 {

	public int minFallingPathSum(int[][] matrix) {
        int ansMin = Integer.MAX_VALUE;
        for(int c = 0; c < matrix[0].length; c++) {
            int ans = sol(matrix, 0, c, matrix.length - 1, matrix.length - 1);
            ansMin = Math.min(ansMin, ans);
        }
        
        return ansMin;
    }
    
    private int sol(int[][] cost, int cr, int cc, int er, int ec) {
		// TODO Auto-generated method stub

		if(cc < 0 || cc > ec ) {
			return Integer.MAX_VALUE;
		}
		
		if(cr == er) {
			return cost[cr][cc];
		}
		int c1 = sol(cost, cr + 1, cc - 1, er, ec);
		int c2 = sol(cost, cr + 1, cc, er, ec);
		int c3 = sol(cost, cr + 1, cc + 1, er, ec);
		
		return Math.min(c1, Math.min(c2, c3)) + cost[cr][cc];
	}
}
