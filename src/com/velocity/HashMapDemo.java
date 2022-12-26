package com.velocity;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
		map.put("Kshitija", "111");
		map.put("Pritam", "122");
		map.put("Dakshata", "211");
		map.forEach((k,v)->System.out.println(k+" "+v));
	}
}
