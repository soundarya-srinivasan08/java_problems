package arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyElementCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aob = new ArrayList<String>();
		aob.add("one");
		aob.add("two");
		aob.add("three");
		aob.add("four");
		List<String> lob = new ArrayList<String>();
		lob.add("one");
		lob.add("four");
		System.out.println("Does Arraylist contains all elements? :" +aob.containsAll(lob));
		lob.add("one");
		System.out.println("Does the array list contails all added list? :"+aob.containsAll(lob));
		

	}

}
