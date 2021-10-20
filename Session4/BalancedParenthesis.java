package Session4;

public class BalancedParenthesis {

	private static void genParen(int oc, int cc, int n, String comb) {
		// TODO Auto-generated method stub

		if(oc == n && cc == n) {
			System.out.println(comb);
			return;
		}
		
		//2 rec works - open and close
		if(oc < n) { //place ( 
			genParen(oc + 1, cc, n, comb + '(');
		}
		
		//place )
		if(oc > cc) {
			genParen(oc, cc + 1, n, comb + ')');
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		genParen(0, 0, n, "");
	}

}
