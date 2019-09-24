package com.nt.array;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
        al.add(1);
        al.add(10);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        System.out.println(al);
        al.remove(5);
        System.out.println(al);
        al.remove(new Integer(10));
        System.out.println(al);
        al.remove(al);
        System.out.println(al);
	}

}
