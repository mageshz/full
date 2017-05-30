//import java.util.ArrayList;
//import java.util.List;

/*
 * Bijon Mathew
 * 21/05/2017
 */
public class StringReverserWithRecursion implements StringReverser {

	public String reverse(String stringToBeReversed) {
		if ((stringToBeReversed == null) || (stringToBeReversed.length() <= 1)) {
			return stringToBeReversed;
		} else {
			return reverse(stringToBeReversed.substring(1)) + stringToBeReversed.charAt(0);
		}

	}

}