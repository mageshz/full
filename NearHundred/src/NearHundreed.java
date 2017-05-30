//Mageshz
//Date:15/5/17
public class NearHundreed {
	public static boolean check(int number) {
		if (number < 111) {

			int difference = 100 - number;
			int num = Math.abs(difference);
			if (num <= 10) {
				return true;
			}

			return false;
		}
		if (number > 111) {

			int diff = 200 - number;
			int nu = Math.abs(diff);
			if (nu <= 10) {
				return true;
			}

			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		{ //Test case 1
			int numbeer=93;
			boolean result = NearHundreed.check(numbeer);
			System.out.println("" + result);	
			
		}
		{ //Test case 2
			int numbeer=90;
			boolean result = NearHundreed.check(numbeer);
			System.out.println("" + result);	
			
		}
		{ //Test case 3
			int numbeer=89;
			boolean result = NearHundreed.check(numbeer);
			System.out.println("" + result);	
			
		}
		{ //Test case 4
			int numbeer=110;
			boolean result = NearHundreed.check(numbeer);
			System.out.println("" + result);	
			
		}
		{ //Test case 5
			int numbeer=209;
			boolean result = NearHundreed.check(numbeer);
			System.out.println("" + result);	
			
		}
		{ //Test case 6
			int numbeer=250;
			boolean result = NearHundreed.check(numbeer);
			System.out.println("" + result);	
			
		}
		{ //Test case 7
			int numbeer=211;
			boolean result = NearHundreed.check(numbeer);
			System.out.println("" + result);	
			
		}
		
				

	}

}
