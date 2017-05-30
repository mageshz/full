import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CountSixCountAndNine {

	static int count6 = 0;
	static int consecutive6 = 0;
	static int consecutive9 = 0;

	static int count9 = 0;

	// public static int check(List<Integer> list) {
	// Iterator itr = list.iterator();
	public static int ConsecSix(List<Integer> list) {
		for (int i = 0; i < list.size()-1 ; i++) {

			if (list.get(i) == 6) {
				count6++;
				if (list.get(i + 1) == 6) {
					consecutive6++;

				} else if (list.get(i - 1) == 6) {
					consecutive6++;
				}

			}

		}
		System.out.println("Number of 6's : " +count6 );
		System.out.println("Number of Consecutive6's : " +consecutive6 );
		return consecutive6;
	}

	public static int ConsecNine(List<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {

			if (list.get(i) == 9) {
				count9++;
				if (list.get(i + 1) == 9) {
					consecutive9++;

				} else if (list.get(i - 1) == 9) {
					consecutive9++;
				}

			}

		}
		System.out.println("Number of 9's : " + count9);
		System.out.println("Number of Consecutive 9's : " + consecutive9);
		return consecutive9;
	}
	/*
	 * while (itr.hasNext()) { int value=itr.next(); if (value == 6) { count6++;
	 * if(){
	 */

	// }

	// check next elements till we have not six so create a loop
	// if((int)i.next()==9)

	// {
	// count9++;
	// }
	// }

	public static void main(String args[]) {
		List<Integer> l = Arrays.asList(6, 6, 6, 6, 6, 6, 5, 6, 5, 1,6,6, 1,6,6,8);

		CountSixCountAndNine.ConsecSix(l);
		// System.out.println("" + result);

	}
}
