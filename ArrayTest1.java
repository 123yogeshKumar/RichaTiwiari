package com.nt.array;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class ArrayTest1 {

	public static void main(String[] args) {

      ArrayList<String> al= new ArrayList<String>();
      
      LinkedList<String> ll=new LinkedList<String>();
      
      System.out.println(al instanceof Serializable);
      
      
      System.out.println(al instanceof Cloneable);
      
      System.out.println(ll instanceof Serializable);
      System.out.println(ll instanceof Cloneable);
      
      System.out.println(ll instanceof RandomAccess);
      System.out.println(al instanceof RandomAccess);
      
     ll.add("yogesh");
     ll.add("101");
     ll.add("hyd");
     System.out.println(ll);
     ll.addFirst("rahul");
     System.out.println(ll);
     ll.set(0, "Raja");
     System.out.println(ll);
     ll.removeLast();
     System.out.println(ll);
     
      System.out.println(al);
      Vector <String>v=new  Vector<String>();
      System.out.println(v instanceof Serializable);
      System.out.println(v instanceof RandomAccess);
      System.out.println(v.capacity());
   //   String i=10;
      for(int i = 1;i<=10;i++) {
    	  v.addElement("i");
      }
      System.out.println(v.capacity());
      v.addElement("y");
      System.out.println(v.capacity());
    // v.add(1,"raja");
     v.addElement("rajaa");
     v.addElement("obj");
     System.out.println(v);
      
      
	}

}
