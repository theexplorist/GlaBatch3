package Session3;

public class LastOcc {

	private static int lastOcc(int[] arr, int ci, int search) {
		// TODO Auto-generated method stub

		if(ci == -1) {
			return -1;
		}
		if(arr[ci] == search) {
			return ci;
		}
		
		int recAns = lastOcc(arr, ci - 1, search);
		return recAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 20, 30, 20, 40};
		
		System.out.println(lastOcc(arr, arr.length - 1, 50));
	}

}
