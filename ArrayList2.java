package com.nt.array;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
         al.add("a");
         al.add("b");
         al.add("c");
         al.add("d");
         al.add("a");
         
         System.out.println(al);
          al.remove(new String("a"));
         System.out.println(al);
         al.remove(0);
         System.out.println(al);
	}

}
