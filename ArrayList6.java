package com.nt.array;

import java.util.ArrayList;

public class ArrayList6 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new A(5));
		al.add(new A(6));
		al.add(new A(7));
		System.out.println(al);
		
		al.remove(new A(7));
		System.out.println(al);
		
	}

}
