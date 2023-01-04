package com.linkedList.demo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(300);
		list.add(44);
		list.add(66);
		list.stream().forEach(x->System.out.println(x));
		
	}
}
