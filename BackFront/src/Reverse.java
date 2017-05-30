

//Mageshz
//26th May


public class Reverse {

	public String reversee(String source){
		String result="";
		int length=source.length();
		for(int i=length-1;i>=0;i--){
			result+=source.charAt(i);
		}
		
		return result;
	}
	
public String small(String sc,int length,int firlength){
		
		StringBuffer result=new StringBuffer();
	// creating the new substring for the first two letters
				String first = sc.substring(0, 1);
				

				// creating the new substring for the last two letters
				String middle = sc.substring(1, firlength);

				// creating the separate substring for the middle elements
				String last = sc.substring(firlength);
				result.append(last);
				result.append(middle);
				result.append(first);
				String Out=result.toString();
				return Out;
	}
	
public String Bigger(String source,int length,int start){
	
	StringBuilder result=new StringBuilder();
	// creating the new substring for the first two letters
				String first = source.substring(0, 2);

				// creating the new substring for the last two letters
				String last = source.substring(start, length);

				// creating the separate substring for the middle elements
				String middle = source.substring(2, start);
                String reversedfirst=reversee(first);
                String reversedlast=reversee(last);
				
				// reversing the first two elements by using calling reversee method
				

				// Finally printing the result
				//System.out.println("" + reversefirst + "" + middle + "" + reverselast);
				result.append(reversedfirst);
				result.append(middle);
				result.append(reversedlast);
				String Out=result.toString();
				return Out;
	
	
}



}
