package Session8;

public class Knapsack01 {

	private static int sol(int curr, int n, int[] wt, int[] price, int bagC) {
		// TODO Auto-generated method stub

		if(bagC == 0 || curr == n) {
			return 0;
		}
		
		int c1 = 0, c2 = 0;
		
		if(wt[curr] <= bagC) {
			c1 = price[curr] + sol(curr + 1, n, wt, price, bagC - wt[curr]);
		}
		
		c2 = sol(curr + 1, n, wt, price, bagC);
		
		return Math.max(c1, c2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
