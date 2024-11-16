package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceHashMap;

@RestController
@RequestMapping("/v1")
public class FirstController {

	@Autowired
	ServiceHashMap service;

	@GetMapping("/get")
	public HashMap<String, String> get() {
		return service.map("get");
	}

	@PostMapping("/post")
	public HashMap<String, String> post() {
		return service.map("post");
	}

	@PutMapping("/put")
	public HashMap<String, String> put() {
		return service.map("put");
	}

	@DeleteMapping("/delete")
	public HashMap<String, String> delete() {
		return service.map("delete");
	}
}