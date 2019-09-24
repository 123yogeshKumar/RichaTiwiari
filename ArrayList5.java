package com.nt.array;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList al =new ArrayList<>();
		al.add(new StringBuilder("A"));
		al.add(new StringBuilder("B"));
		StringBuffer sa=new StringBuffer();
		al.add(sa);
		
		System.out.println(al.toString());
		al.remove(new StringBuilder("C"));
		System.out.println(al.toString());
		al.remove(sa.toString());
		System.out.println(al);
	}

}
