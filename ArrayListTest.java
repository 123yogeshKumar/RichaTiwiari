package com.nt.array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("y");
		al.add("o");
		al.add("g");
		al.add("e");
		al.add("s");
		al.add("h");
System.out.println(al);
for(int i=0; i<=al.size()-1;i++) {
	//System.out.println(al.get(i));
	
	Object object=al.get(i);
	String string=(String) object;
	System.out.println(string.toUpperCase());
	
}
System.out.println();
System.out.println(al);
	}

}
