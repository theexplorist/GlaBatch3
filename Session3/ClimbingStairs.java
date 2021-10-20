package Session3;

public class ClimbingStairs {

	private static void paths(int cStep, int n, String path) {
		// TODO Auto-generated method stub

		//+ve base case
		if(cStep == n) {
			System.out.println(path);
			return;
		}
		
		//-ve base case - no valid path possible
		if(cStep > n) {
			return;
		}
		//every state 2 choices = 2 rec calls fixed
		paths(cStep + 1, n, path + 1); // 1 ka jump
		paths(cStep + 2, n, path + 2); // 2 ka jump
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		paths(0, 3, "");
	}

}
