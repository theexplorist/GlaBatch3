package Session1;

public class FunctionInMemory {

	
	private static void yo() {
		// TODO Auto-generated method stub

		System.out.println("Yo bro!");
		return;
	}
	private static void hello() {
		// TODO Auto-generated method stub

		System.out.println("Or kya haal hai?");
		yo();
		System.out.println("mast bhai!");
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hello();
		System.out.println("main hun main");
	}

}
