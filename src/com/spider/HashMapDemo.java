package com.spider;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map= new HashMap<>();
		map.put("ram", 111);
		map.put("sam", 211);
		map.put("kam", 321);
		map.forEach((k,v)->System.out.println(k+" "+v));
		
	}
}
