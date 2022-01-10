package Session13;

import java.util.Stack;

public class FormMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inp = "IDIIIIDD";
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i <= inp.length(); i++) {
			//i = 0, i = 1, i = 2
			st.push(i + 1);
			
			if(i == inp.length() || inp.charAt(i) == 'I') {
				while(!st.isEmpty()) {
					System.out.print(st.pop());
				}
			}
		}
	}

}
