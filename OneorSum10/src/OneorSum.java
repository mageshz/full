//author:Mageshz again submitted
//date:11th may 2017 at 5:57 pm
//mentor:JAMES
public class OneorSum {

	public static boolean isOneOrSum10(int a, int b) {
		if ((a == 10) || (b == 10) || (a + b == 10)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		{// test 1
			int a = 10;
			int b = 0;
			boolean result = isOneOrSum10(a, b);
			System.out.println("" + result);

		}
		{// test 2
			int a = 9;
			int b = 10;
			boolean result = isOneOrSum10(a, b);
			System.out.println("" + result);

		}
		{// test 3
			int a = 9;
			int b = 9;
			boolean result = isOneOrSum10(a, b);
			System.out.println("" + result);

		}
		{// test 4
			int a = 1;
			int b = 9;
			boolean result = isOneOrSum10(a, b);
			System.out.println("" + result);

		}

	}

}
