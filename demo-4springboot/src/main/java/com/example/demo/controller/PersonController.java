package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person;
import com.example.demo.service.Personservice;



@Controller
@RestController("/user")
public class PersonController {

	@Autowired
	Personservice personService;

	@GetMapping("/getAll")
	public List<Person> findAll() {
		return personService.getAll();

	}

	@GetMapping("/get1")
	public Person getById(@RequestParam Long id) {
		return personService.getForId(id);
	}

	@PostMapping("/post")
	public Person postMethodName(@RequestBody Person entity) {
		return personService.insertData(entity);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAll() {
		personService.deleteAll();
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		personService.deleteData(id);
	}

}
