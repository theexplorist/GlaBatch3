package Session3;

public class NthFibo {

	private static int nthFibo(int n) {
		// TODO Auto-generated method stub

		//base case
		if(n == 0 || n == 1) {
			return n;
		}
		//rec works - 2
		int fibN_1 = nthFibo(n - 1);//aman
		int fibN_2 = nthFibo(n - 2); //rishabh
		
		//my work
		int fibN = fibN_1 + fibN_2;
		return fibN;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(nthFibo(4));
	}

}
