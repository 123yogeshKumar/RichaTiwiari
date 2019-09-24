package com.nt.array;

import java.util.*;

public class VectorTest {
	public static void main(String[] args) {
	
		Vector v= new Vector();
		for( int i=1; i<=10; i++) {
			v.addElement(i);
		}
	
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.addElement("R");
		v.addElement("y");
		v.addElement("o");
		v.removeElement("y");
		System.out.println(v);
		
		
	}
	

}
