//author:Mageshz
//date and time:6/5/2017 at 9:40 PM
//It was the same as that of  the FIZZBUZZ challenge
public class Multiple {
	public static boolean check(int a) {
		if (a % 3 == 0 && a % 5 == 0) {
			return false;
		} else if (a % 3 == 0 || a % 5 == 0) {

			return true;
		}
		return false;

	}

	public static void main(String args[]) {
		boolean result = Multiple.check(25);
		System.out.println("" + result);
		boolean resut = Multiple.check(26);
		System.out.println("" + resut);
		boolean rsult = Multiple.check(15);
		System.out.println("" + rsult);
		boolean reslt = Multiple.check(6);
		System.out.println("" + reslt);
		
		
		
		//My own test cases
		
		boolean result1 = Multiple.check(356);//not divided by both 3 and 5
		System.out.println("" + result1);
		boolean resut1 = Multiple.check(600000000);//divided by boht 3 and 5
		System.out.println("" + resut1);
		boolean rsult1 = Multiple.check(222468123);//divided only by 3
		System.out.println("" + rsult1);
		boolean reslt1 = Multiple.check(380074895);//divided only by 5
		System.out.println("" + reslt1);
		
		

	}
}
//default inputs//25 26 15 6 
//additional test cases
//356
//60 
//char (this cannnot be applicable as Ide itself shows error)
//int32.maxvalue//(Ide doesnot allow to compile it shows errors)