package arrayList;

import java.util.ArrayList;

public class MyarrayListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aob = new ArrayList<String>();
		aob.add("one");
		aob.add("two");
		aob.add("three");
		aob.add("four");
		System.out.println("Actual ArryaList :"+aob);
		String[] strArr = new String[aob.size()];
        aob.toArray(strArr);
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
        }

	}

}
