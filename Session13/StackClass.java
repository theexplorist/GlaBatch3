package Session13;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st);
		System.out.println(st.pop());//returns the element value that is removed
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());//no deletion
		System.out.println(st.isEmpty());
		System.out.println(st.size());
	}

}
