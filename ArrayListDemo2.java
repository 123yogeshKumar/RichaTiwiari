package com.nt.array;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add("yogesh");
		al.add(1000);
		
		System.out.println();
		al.add("mukesh");
		al.add(2000);
		System.out.println();
		al.add("satish");
		al.add(3000);
		System.out.println();

		
		for(int i=0;i<al.size();i++) {
			Object obj=al.get(i);
			if(obj instanceof String) {
			String str=(String) obj;
			System.out.println(str.toUpperCase()+"\n");
			}else {
				System.out.println(al);
			}
			
		}
	}

}
