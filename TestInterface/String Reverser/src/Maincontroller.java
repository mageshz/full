import java.util.Scanner;

public class Maincontroller {
	public static void main(String[] args) {
		long startTime = 0;
		long endTime = 0;
		long timeTaken = 0;
		
		long startCount = 0;
		long endCount = 0 ;
		long countTime = 0;
		
		String output = "";
		StringReverserWithoutRecursion withoutRecursion = new StringReverserWithoutRecursion();
		StringReverserWithRecursion withRecursion = new StringReverserWithRecursion();

		String stringToBeReversed = "";
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		stringToBeReversed = scan1.nextLine();
		scan1.close();
		
		int i = 0;
		int times = 100000;
		startTime = System.currentTimeMillis();
		for (i = 0; i < times; i++) {
			output = withRecursion.reverse(stringToBeReversed);

		}
		endTime = System.currentTimeMillis();
		
		startCount = System.currentTimeMillis();
		for (i = 0; i < times; i++) {
			output = withoutRecursion.reverse(stringToBeReversed);

		}
		endCount = System.currentTimeMillis();
		
		countTime = endCount - startCount;
		timeTaken = endTime - startTime;
		
		System.out.println("Time taken by recursive method : "+timeTaken);
		System.out.println("Time taken by non recursive method : "+countTime);
		
	}

	
	
	
}


