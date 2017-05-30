import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainController {

	public static void main(String args[]) {
//		{// Test Case 1;
//			long start = System.currentTimeMillis();
//			System.out.println("Starting Time(Milli seconds):"+start);
//			List test = new ArrayList<>();
//			test.addAll(Arrays.asList(1, 4, 6, 6, 6));
//			int result=CountSixCountAndNine.ConsecSix(test);
//			if(result==3){
//				System.out.println("Test Passes");
//			}else{
//				System.out.println("Test Fails");
//			}
//                 long stop=System.currentTimeMillis();
//                 long diff=stop-start;
//                 double reslt=diff/1000.0;
//                 System.out.println("Finishing Time(Milli seconds): "+stop);
//                 System.out.println("Time taken to execute program "+diff);
//		}
		long start = System.currentTimeMillis();
		List pass = new ArrayList<>();
		pass = RandomGenerator.randomgen();
		CountSixCountAndNine.ConsecSix(pass);
		CountSixCountAndNine.ConsecNine(pass);
		long stop = System.currentTimeMillis();
		long res=stop-start;
		System.out.println(""+res);

	}

}
