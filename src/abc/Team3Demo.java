package abc;

public class Team3Demo {
	public static void main(String[] args) {

		String n1 = "john";
		int i = 24;

		System.out.println(n1 + i);

		System.out.println("Team 3...");

		System.out.println("Are we going to work yet");

	}

	String name = "john";
	int num = 24;

	public static int addNums(int a, int b) {
		int result = a + b;

		return result;
	}

	public static int addNums(int a, int b, int c) {
		int result = a + b + c;

		return result;
	}

	public static String toLower(String name) {
		String result = name.toLowerCase();

		return result;
	}

}