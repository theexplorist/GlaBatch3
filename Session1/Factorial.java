package Session1;

public class Factorial {

	private static int fact(int n) {
		// TODO Auto-generated method stub
		//Base case
		if(n == 0) {
			return 1;
		}
		
		int recAns = fact(n - 1); //faith
		//mera kaam(my work)
		int meraAns = n * recAns;
		return meraAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		System.out.println(fact(n));
	}

}
