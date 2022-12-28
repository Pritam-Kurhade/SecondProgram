package com.linkedlistdemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll= new LinkedList<Integer>();
	ll.add(7);
	ll.add(8);
	ll.add(9);
	ll.stream().forEach(x->System.out.println(x));
	}
}
