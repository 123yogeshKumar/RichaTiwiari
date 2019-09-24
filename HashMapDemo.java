package com.nt.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
				IdentityHashMap m=new IdentityHashMap();
				Integer i1=new Integer(10);
				Integer i2=new Integer(10);
				m.put(i1,"pavan");
				m.put(i2,"kalyan");
				System.out.println(m);
				System.out.println(i1.equals(i2));
				System.out.println(i1==i2);
	}

}
