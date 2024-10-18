package arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListSubRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aob = new ArrayList<String>();
		aob.add("one");
		aob.add("two");
		aob.add("three");
		aob.add("four");
		System.out.println("Actual ArryaList :"+aob);
		List<String> lob = aob.subList(1,3);
		System.out.println("Sublist :"+lob);
		

	}

}
