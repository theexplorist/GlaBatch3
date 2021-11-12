package Session6;

public class BacktrackingDemo {

	private static void kamlesh(char[] satyamGhar, int roomNo) {
		// TODO Auto-generated method stub

		if(roomNo == satyamGhar.length) {
			return;
		}
		satyamGhar[roomNo] = 'B';
		kamlesh(satyamGhar, roomNo + 1);
		satyamGhar[roomNo] = 'W';//undo - backtracking
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] satyamGhar = {'W', 'W', 'W'};
		
		for(char color : satyamGhar) {
			System.out.print(color + " ");
		}
		
		System.out.println();
		kamlesh(satyamGhar, 0);
		for(char color : satyamGhar) {
			System.out.print(color + " ");
		}
	}

}
