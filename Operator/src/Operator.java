// Author:Mageshz
//date:4th May 2017
//while doing it i also learnt how Pre and Post increment works
//Thank you for your motivation and encouragement 
public class Operator {

	public static int add(int a) {
		return ++a;//change post increment to pre-increment to see the results
	}

	public static void main(String args[]) {
		int a = 5;
		int result = Operator.add(a);//change this line and pass only variable a
		System.out.println("value of a still is " + a);
		if (a == 6) {
			System.out.println("Test passes");
		} else {
			System.out.println("Test fails");
		}
	}
}
