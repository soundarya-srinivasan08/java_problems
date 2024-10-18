package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aob = new ArrayList<String>();
		aob.add("one");
		aob.add("two");
		aob.add("three");
		aob.add("four");
		
		Collections.shuffle(aob);
		System.out.println(" My ArryaList after shuffle :");
		for(String str :aob) {
			System.out.println(str);
		}
		Collections.shuffle(aob);
		System.out.println("My Arraylist after shuffle : ");
		for(String str: aob) {
			System.out.println(str);
			
		}
			
		
	}

}
