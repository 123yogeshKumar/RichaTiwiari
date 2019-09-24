package com.nt.collection;
import java.util.*;

public class HashDemo {

	public static void main(String[] args) {
      LinkedHashSet<String> h= new LinkedHashSet<String>();
 //HashSet h=new HashSet();
       
       h.add("A"); 
       h.add("b");
       h.add("c");
       h.add("e");
       System.out.println(h);
       h.add(null);
       System.out.println(h);
       h.add(null);
       System.out.println(h.add(null));
       System.out.println(h);
	}
}
