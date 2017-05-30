//author:Mageshz
//date and time: 10:20 AM sunday 7/5/2017
//mentor:James

package notAstring;

public class notAstring {
	public static String check(String s) {

		if (s.startsWith("not")) {//startswith is a predefined method to check if the string already startswith the specified string or not
			return s;
		}
		return "not " + s;// concatenate the string with not if it is not there
							// already
	}

	public static void main(String args[]) {
		String result = notAstring.check("going to happen");
		System.out.println("" + result);
		String result1 = notAstring.check("a");
		System.out.println("" + result1);
		String resul = notAstring.check("not interested");
		System.out.println("" + resul);
	}

}
//passed all the test cases