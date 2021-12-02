package Session10;

public class MinpathSum {

	private int sol(int[][] cost, int cr, int cc, int dr, int dc) {
		// TODO Auto-generated method stub

		if(cr > dr || cc > dc) {
			return Integer.MAX_VALUE;
		}
		if(cr == dr && cc == dc) {
			return cost[cr][cc];
		}
		int c1 = sol(cost, cr, cc + 1, dr, dc);
		int c2 = sol(cost, cr + 1, cc, dr, dc);
		
		return Math.min(c1, c2) + cost[cr][cc];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
