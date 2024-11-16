package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Currency;
import com.example.demo.service.CurrencyService;

@RestController
@RequestMapping("/salary")
public class SalaryController {

	@Autowired
	private CurrencyService currencyService;
	
	@GetMapping("/all")
	public List<Currency> getAll(@RequestParam String coun) {
		return currencyService.getAllCurrency();
	}
	
	@GetMapping("/{id}/{coun}")
	public String getById(@PathVariable Long id,@PathVariable String coun) {
		return currencyService.findCurrency(id).getCountry();
	}
	
	
	
}