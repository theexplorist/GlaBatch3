package Session1;

public class PrintStringReverse {

	private static void printChar(String str) {
		// TODO Auto-generated method stub

		if (str.length() == 0) {// base case
			return;
		}

		String bachiKuchi = str.substring(1);
		// System.out.println(bachiKuchi);
		printChar(bachiKuchi);// rec call to print string from 1 to last index

		char cc0th = str.charAt(0);
		System.out.println(cc0th);// mera kaam
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "java";
		printChar(str);
	}

}
