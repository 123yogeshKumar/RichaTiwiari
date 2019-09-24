package com.nt.array;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
       Stack<String> s =new Stack<String>();
       s.push("Y");
       s.push("o");
       s.push("g");
       s.push("e");
       s.push("s");
       s.push("h");
       System.out.println(s);
       System.out.println(s.pop());
       System.out.println(s.peek());
       System.out.println(s.isEmpty());
       System.out.println(s.capacity());
       System.out.println(s.search("z"));
       System.out.println(s.parallelStream());
       HashSet h=new HashSet();
       
       h.add("A");
       h.add("b");
       h.add("c");
       System.out.println(h);
       h.add(null);
       System.out.println(h);
       h.add(null);
       System.out.println(h.add(null));
      
      System.out.println(s);
	}

}
