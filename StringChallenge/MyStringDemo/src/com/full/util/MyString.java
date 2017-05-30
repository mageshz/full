
public class MyString implements AbstractMyString {

	/*
	 * Reverses the string and stores the reversed result, and it returns the
	 * reversed string.
	 */
	public static String reverse(String s){
		for(int i=s.length()-1,j=0;i>=0,j<s.length();i--,j++){
			String revers="";
			revers[j]=s[i];
			
		}
		return revers;
	}

	/*
	 * Get the number of vowels in the String and return the count.
	 */
	public abstract int getVowelsCount();

	/*
	 * Get the number of consonants in the String and return the count.
	 */
	public abstract int getConsonantCount();

	/*
	 * Get the number of Capital Letters in the string and return the count.
	 */
	public abstract int getNumCapitalLetters();

	/*
	 * Get and return the length of the string.
	 */
	public abstract int getLength();

	/*
	 * Counts the sum of all the letters where the value of each letter is based
	 * on its position in the alphabet. For instance, a=1, b=2, h=8, and z=26.
	 * Thus, the string "hello" would sum to 8+5+12+12+15 = 52
	 */
	public abstract int getSumOfAllCharacters();

}
public static void main(String args[]){
	String r=MyString.reverse("raaam");
	System.out.println(""+r);
	
}
	
	
}
