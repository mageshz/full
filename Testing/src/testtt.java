public class testtt {
	public static void main(String args[]) {
//		String a = "sd";
//		String b = "sd";
//		b.intern();
//		if(a==b){
//			System.out.println("same reference");
//		}else{
//			System.out.println("diferent");
//		}

	String source="abcd";	
		
			int sum=0;
			for(char c:source.toCharArray()){
				sum+=c-'a'+1;
				
			}
			
	
		
	System.out.println(""+sum);
	
	
	}	
		
}