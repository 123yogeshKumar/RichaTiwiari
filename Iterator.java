package com.nt.collection;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		for(int i=0;i<=10;i++) {
			al.add(i);
			
		}
		System.out.println(al);
		java.util.Iterator itr=al.iterator();
		 while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if( i%2==0) 
				//System.out.println(i);
		 
			   System.out.println(i);
		 
			else 
				  itr.remove();
			//System.out.println(al);
		 }
			System.out.println(al);
			
				
			
		}
		
	}
			
            



