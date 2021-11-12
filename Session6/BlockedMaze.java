package Session6;

public class BlockedMaze {

	private static void printPath(int[][] maze, int cr, int cc, int dr, int dc, String path, boolean[][] vis) {
		// TODO Auto-generated method stub

		if(cr > dr || cc > dc || cr < 0 || cc < 0 || vis[cr][cc] || maze[cr][cc] == 1) {
			return;
		}
		if(cr == dr && cc == dc) {
			System.out.println(path);
			return;
		}
		
		vis[cr][cc] = true;
		printPath(maze, cr - 1, cc, dr, dc, path + 'U', vis);
		printPath(maze, cr + 1, cc, dr, dc, path + 'D', vis);
		printPath(maze, cr, cc - 1, dr, dc, path + 'L', vis);
		printPath(maze, cr, cc + 1, dr, dc, path + 'R', vis);
		vis[cr][cc] = false;
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] maze = {{0, 1, 0, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
		printPath(maze, 0, 0, 3, 3, "", new boolean[4][4]);
	}

}
