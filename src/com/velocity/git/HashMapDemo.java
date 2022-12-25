package com.velocity.git;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> hm= new HashMap<>();
		hm.put("kb", "latur");
		hm.put("pk", "wardha");
		hm.put("db", "mumbai");
		hm.forEach((k,v)->System.out.println(k+".. "+v));
	}
}
