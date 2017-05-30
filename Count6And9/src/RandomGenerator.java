import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {

	static List<Integer> numbers = new ArrayList<>();
	static final int MIN = 1;
	static final int MAX = 100;
	static final int TOTAL = 10000000;

	public static List<Integer> randomgen() {
		//int i = 0;
		for (int i = 0; i < TOTAL; i++) {
			int randoNum = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
			numbers.add(randoNum);
		}

		return numbers;
	}

	public static void main(String args[]) {

		//Collection<Integer> result = randomgen();
		if (numbers.size() == TOTAL) {
			System.out.println("Test Passed");

		} else {

			System.out.println("Test Failed");

		}

	}

}
