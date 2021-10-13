package Session2;

public class StringLegnthUsingRecursion {

	private static int length(String str) {
		// TODO Auto-generated method stub
		if(str.isEmpty()) {
			return 0;
		}
		String bachiKuchi = str.substring(1); //"Ava"
		int recAns = length(bachiKuchi);//3
		// "Java" = "J" + "AVA"
		int meraAns = recAns + 1;//"JAVA"
		return meraAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(length("javaBoy"));
	}

}
