package com.example.demo.controllertest;

import java.util.HashMap;

public class ControllerHashMap {
	public HashMap<String, String> map(String test) {
		HashMap<String, String> hashmap = new HashMap<>();
		hashmap.put("1", "one");
		hashmap.put("2", "two");
//		if (test.equalsIgnoreCase("post"))
//			hashmap.put("3", "three");
//		if (test.equalsIgnoreCase("put"))
//			hashmap.put("1", "one+one");
//		

		if (test.equalsIgnoreCase("get")) {

			hashmap.put("3", "three");
			return hashmap;
		}
if (test.equalsIgnoreCase("put")) {
	hashmap.put("1", "one+one");
	return hashmap;
}
		return hashmap;

	}

}
