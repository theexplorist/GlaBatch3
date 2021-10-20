package Session3;

public class LastOcc2 {

	public static int lastocc(int[] arr, int ci, int search) {
		
		if(ci == arr.length) {
			return -1;
		}
		//move to last index with help of recursion
		
		int recAns = lastocc(arr, ci + 1, search);
		
		if(recAns == -1 && arr[ci] == search ) {
			return ci;
		}
		
		return recAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 20, 30, 20, 40};
		System.out.println(lastocc(arr, 0, 50));
	}

}
