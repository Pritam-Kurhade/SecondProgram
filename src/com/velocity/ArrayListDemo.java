package com.velocity;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(44);
		al.add(55);
		al.add(88);
		al.stream().forEach(x->System.out.println(x));
	}
}
