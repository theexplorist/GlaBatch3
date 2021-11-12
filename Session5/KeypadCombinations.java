package Session5;

public class KeypadCombinations {

	private static String mapping(char cc) {
		// TODO Auto-generated method stub

		if (cc == '2') {
			return "abc";
		} else if (cc == '3') {
			return "def";
		} else if (cc == '4') {
			return "ghi";
		} else if (cc == '5') {
			return "jkl";
		} else if (cc == '6') {
			return "mno";
		} else if (cc == '7') {
			return "pqrs";
		} else if (cc == '8') {
			return "tuv";
		} else if (cc == '9') {
			return "wxyz";
		}

		return "";
	}

	private static void letterCombi(String inp, String out) {
		// TODO Auto-generated method stub

		if(inp.length() == 0) {
			System.out.println(out);
			return;
		}
		char cc0th = inp.charAt(0);//'2'
		String mappedString = mapping(cc0th);//"abc"
		
		for(int i = 0; i < mappedString.length(); i++) {
			char ith = mappedString.charAt(i);
			String ros = inp.substring(1);
			letterCombi(ros, out + ith);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(mapping('7'));
		letterCombi("274", "");
	}

}
