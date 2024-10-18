package arrayList;

import java.util.ArrayList;
import java.util.Collections;


public class MyArrayListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aob = new ArrayList<String>();
		aob.add("one");
		aob.add("two");
		aob.add("three");
		aob.add("four");
		System.out.println("Actual ArryaList :"+aob);
		Collections.reverse(aob);
		System.out.println("result after reverse : "+aob);
		for(String str :aob) {
			System.out.println(str);
		}
		

	}

}
