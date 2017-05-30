//import java.util.ArrayList;
//import java.util.List;

/*Bijon Mathew
 * 21/05/2017
 */
public class StringReverserWithoutRecursion implements StringReverser {

	public String reverse(String stringToBeReversed) {
		int length = stringToBeReversed.length();

		String reverse = "";
		int i = 0;
		for (i = length - 1; i >= 0; i--) {
			reverse = reverse + stringToBeReversed.charAt(i);

		}
		return reverse;

	}

	
}
