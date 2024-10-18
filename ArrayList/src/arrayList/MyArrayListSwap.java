package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aob = new ArrayList<String>();
		aob.add("one");
		aob.add("two");
		aob.add("three");
		aob.add("four");
		aob.add("apple");
		aob.add("orange");
		Collections.swap(aob,1,2);
		System.out.println("Result after swap operation:");
		for(String str:aob) {
			System.out.println(str);
		}

	}

}
