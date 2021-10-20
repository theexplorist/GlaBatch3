package Session4;

public class GenerateSubsequences {

	private static void genSubs(String inp, String out) {
		// TODO Auto-generated method stub

		if(inp.length() == 0) {
			System.out.println(out);
			return;
		}
		//rec works - 2 from every state
		char cc0th = inp.charAt(0);
		String bachiKuchi = inp.substring(1);
		genSubs(bachiKuchi, out); //exc/rej
		genSubs(bachiKuchi, out + cc0th); //inc/sel
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		genSubs("ab", "");
	}

}
