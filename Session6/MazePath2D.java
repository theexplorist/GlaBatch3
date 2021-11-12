package Session6;

public class MazePath2D {

	private static void printPath(int cr, int cc, int dr, int dc, String path) {
		// TODO Auto-generated method stub

		if(cr > dr || cc > dc) {
			return;
		}
		
		if(cr == dr && cc == dc) {
			System.out.println(path);
			return;
		}
		
		
		printPath(cr, cc + 1, dr, dc, path + 'H');
		printPath(cr + 1, cc, dr, dc, path + 'V');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3, m = 3;
		printPath(0, 0, n - 1,  m - 1, "");
	}

}
