package Session5;

public class ClimbingStairsThreeChoices {

	private static void printPaths(int curr, int dest, String paths) {
		// TODO Auto-generated method stub

		if(curr > dest) {
			return;
		}
		
		if(curr == dest) {
			System.out.println(paths);
			return;
		}
		printPaths(curr + 1, dest, paths + '1');
		printPaths(curr + 2, dest, paths + '2');
		printPaths(curr + 3, dest, paths + '3');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPaths(0, 3, "");
	}

}
