import java.util.*;
import java.*;

public class LinkedLi{
	
	
	public static void main(String args[]){
		
		LinkedList <Integer> a=new LinkedList();
		a.add(5);
		a.add(9);
		
		ListIterator <Integer> listiterator=a.listIterator();
		while(listiterator.hasNext()){
			System.out.println(""+listiterator.next());
			
		}
	}
	

	
	
}