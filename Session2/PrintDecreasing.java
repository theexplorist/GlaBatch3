package Session2;

public class PrintDecreasing {

	private static void printDec(int n) {
		// TODO Auto-generated method stub

		if(n == 0) {
			return;
		}
		
		System.out.println(n);//my work
		printDec(n - 1); //rec work
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printDec(5);
		
	}

}
