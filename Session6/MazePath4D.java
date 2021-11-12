package Session6;

public class MazePath4D {

	private static void printPath(int cr, int cc, int dr, int dc, String path, boolean[][] vis) {
		// TODO Auto-generated method stub

		if(cr > dr || cc > dc || cr < 0 || cc < 0 || vis[cr][cc]) {
			return;
		}
		if(cr == dr && cc == dc) {
			System.out.println(path);
			return;
		}
		
		vis[cr][cc] = true;
		printPath(cr - 1, cc, dr, dc, path + 'U', vis);
		printPath(cr + 1, cc, dr, dc, path + 'D', vis);
		printPath(cr, cc - 1, dr, dc, path + 'L', vis);
		printPath(cr, cc + 1, dr, dc, path + 'R', vis);
		vis[cr][cc] = false;
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3, m = 3;
		printPath(0, 0, n - 1,  m - 1, "", new boolean[3][3]);
	}

}
