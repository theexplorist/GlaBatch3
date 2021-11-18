package Session7;

public class PermuationsOfString {

	static int count;

	private static void printPerm(String inp, String out) {
		// TODO Auto-generated method stub

		if (inp.length() == 0) {
			count++;
			System.out.println(out);
			return;
		}
		for (int i = 0; i < inp.length(); i++) {
			char ccith = inp.charAt(i);
			printPerm(inp.substring(0, i) + inp.substring(i + 1), out + ccith);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = 4;
		while (t-- != 0) {
			count = 0;
			printPerm("abc", "");
			System.out.println(count);
		}
	}

}
