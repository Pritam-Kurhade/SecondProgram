package com.velocity;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> set= new HashSet<>();
		set.add(2);
		set.add(5);
		set.add(55);
		set.stream().forEach(x->System.out.println(x));
		}
}
