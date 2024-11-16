package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Currency;
import com.example.demo.service.CurrencyService;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

	@Autowired
	private CurrencyService currencyService;

	@PostMapping
	public Currency post(@RequestBody Currency currency) {
		return currencyService.saveCurrency(currency);
	}

	@GetMapping
	public Currency get(@RequestParam Long id) {
		return currencyService.findCurrency(id);
	}

	@GetMapping("/getAll")
	public List<Currency> getAll() {
		return currencyService.getAllCurrency();
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		currencyService.deleteCurrency(id);
	}

}