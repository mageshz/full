

//Mageshz H
//date: 26th May

import java.util.Scanner;

public class BackFront extends Reverse {

	public static void main(String args[]) {
		// Get the input from the user
		Scanner sc = new Scanner(System.in);
		String source = sc.nextLine();
		int length = source.length();
		int firlength = length - 1;
		BackFront obj = new BackFront();
/////////////////////////////////////////
		{
			// Test case 1
			String test = "dog";
			String expected = "god";
			String Output = "";
			int len = test.length();
			int fir = len - 1;

			if (len < 4) {

				Output = obj.small(test, len, fir);
				// creating the new substring for the first two letters

			} else {
				int start = len - 2;
				Output = obj.Bigger(test, len, start);
			}

			if (Output.equals(expected)) {
				System.out.println("Test Passes");
			} else {
				System.out.println("Test Fails");
			}

		}
		
///////////////////////////////////////////////////////////////
		{
			// Test case 2
			String test = "hello world";
			String expected = "ehllo wordl";
			String Output = "";
			int len = test.length();
			int fir = len - 1;

			if (len < 4) {

				Output = obj.small(test, len, fir);
				// creating the new substring for the first two letters

			} else {
				int start = len - 2;
				Output = obj.Bigger(test, len, start);
			}

			if (Output.equals(expected)) {
				System.out.println("Test Passes");
			} else {
				System.out.println("Test Fails");
			}

		}
		
///////////////////////////////////////////////////////
		{
			// Test case 3
			String test = "Iam here";
			String expected = "aIm heer";
			String Output = "";
			int len = test.length();
			int fir = len - 1;

			if (len < 4) {

				Output = obj.small(test, len, fir);
				// creating the new substring for the first two letters

			} else {
				int start = len - 2;
				Output = obj.Bigger(test, len, start);
			}

			if (Output.equals(expected)) {
				System.out.println("Test Passes");
			} else {
				System.out.println("Test Fails");
			}

		}
///////////////////////////////////////////////////////////
		// code for the handling of the user input
		if (length < 4) {

			String Output = obj.small(source, length, firlength);
			System.out.println("" + Output);
			// creating the new substring for the first two letters

		} else {
			int start = length - 2;
			String Output = obj.Bigger(source, length, start);
			System.out.println("" + Output);
		}
	}

}
