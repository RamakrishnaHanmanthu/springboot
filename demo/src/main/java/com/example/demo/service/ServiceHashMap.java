package com.example.demo.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;
@Service
public class ServiceHashMap {

	public HashMap<String, String> map(String test) {
		HashMap<String, String> hasMap = new HashMap<>();
		hasMap.put("1", "one");
		hasMap.put("2", "two");
		if (test.equalsIgnoreCase("get"))
			return hasMap;
		if (test.equalsIgnoreCase("post")) {
			hasMap.put("3", "three");
			return hasMap;
		}
		if (test.equalsIgnoreCase("put")) {
			hasMap.put("1", "one+one");
			return hasMap;
		}
		if (test.equalsIgnoreCase("delete")) {
			hasMap.remove("2");
			return hasMap;
		}
		return hasMap;
	}

}