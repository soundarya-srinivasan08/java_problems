package arrayList;

import java.util.ArrayList;

public class MyArrayListClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aob = new ArrayList<String>();
		
	//adding elements to obj
		aob.add("soundarya");
		aob.add("Akshu");
		aob.add("padma");
		aob.add("srini");
		
		System.out.println("Actual arraylist : "+aob);
		ArrayList <String> copy = (ArrayList<String>) aob.clone();
		System.out.println("Cloned ArrayList : "+copy);
		

	}

}
