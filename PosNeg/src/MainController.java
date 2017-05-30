import java.util.Scanner;

public class MainController {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the details of a");
		int a = s.nextInt();
		System.out.println("Enter the details of b");
		int b = s.nextInt();
		System.out.println("Enter the details of negative parameter");
		boolean negative = s.nextBoolean();
		boolean result = PosNeg.check(a, b, negative);
		if (result == true) {
			System.out.println("Returns True");
		} else {
			System.out.println("Returns False");

		}

	}

}
