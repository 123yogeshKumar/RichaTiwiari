package com.nt.array;

import java.util.ArrayList;

public class ReplaceTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println("Original vlaues" + al);

		String s1 = (String) al.get(1);
		String s2 = s1.toUpperCase();
		al.set(1, "y");
		System.out.println("change files " + al);

	}

}
