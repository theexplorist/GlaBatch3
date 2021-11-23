package Session7;

public class TowerOfHanoi {

	private static void toh(int n, char src, char helper, char dest) {
		// TODO Auto-generated method stub

		if(n == 1) {
			System.out.println("Move " + n + "th disk from " + src + " to " + dest);
			return;
		}
		toh(n - 1, src, dest, helper);
		System.out.println("Move " + n + "th disk from " + src + " to " + dest);
		toh(n - 1, helper, src, dest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		toh(4, 'A', 'B', 'C');
	}

}
