package com.nt.array;

import java.util.ArrayList;

public class StringBuffer {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new StringBuilder("a"));
		al.add(new StringBuilder("b"));
		StringBuilder sb3=new StringBuilder();
		al.add(sb3);
		System.out.println(al);
		System.out.println(al.contains(new StringBuilder("a")));
		System.out.println(al.contains(sb3));

	}

}
