package Session5;

public class BoardPath {

	public static void printPaths(int curr, int dest, String path) {
		// TODO Auto-generated method stub

		if(curr > dest) {
			return;
		}
		if(curr == dest) {
			System.out.println(path);
			return;
		}
		printPaths(curr + 1, dest, path + '1'); //dice = 1
		printPaths(curr + 2, dest, path + '2'); //dice = 2
		printPaths(curr + 3, dest, path + '3'); //dice = 3
		printPaths(curr + 4, dest, path + '4'); //dice = 4
		printPaths(curr + 5, dest, path + '5'); //dice = 5
		printPaths(curr + 6, dest, path + '6'); //dice = 6
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPaths(0, 10, "");
	}

}
