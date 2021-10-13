package Session2;

public class FirstOccurence {

	private static int firstOcc(int[] arr, int ci, int search) {
		// TODO Auto-generated method stub

		if(ci == arr.length) {
			return -1;
		}
		if(arr[ci] == search) {
			return ci;
		}
		
		int recAns = firstOcc(arr, ci + 1, search);
		return recAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 20, 30, 20, 40};
		
		System.out.println(firstOcc(arr, 0, 50));
	}

}
