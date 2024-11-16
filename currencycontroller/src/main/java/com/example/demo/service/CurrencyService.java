package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Currency;

import com.example.demo.repository.CurrencyRepository;

@Service
public class CurrencyService {

	@Autowired
	private CurrencyRepository currencyRepository;

	public Currency saveCurrency(Currency currency) {
		return currencyRepository.save(currency);
	}

	public Currency put(Currency currency) {

		Currency existCurrency = currencyRepository.findById(currency.getId()).orElse(null);
		if (existCurrency!=null) {

			existCurrency.setId(currency.getId());
			existCurrency.setCountry(currency.getCountry());
			existCurrency.setCountryCode(currency.getCountryCode());
			existCurrency.setCurrencyType(currency.getCurrencyType());
			existCurrency.setRank(currency.getRank());

			return currencyRepository.save(existCurrency);
		} else {
			return null;
		}
	}

	public Currency getCurrencyById(Long id) {
		return currencyRepository.findById(id).orElse(null);
	}

	public List<Currency> getAllCurrency() {
		return currencyRepository.findAll();
	}

	public Currency findCurrency(Long id) {
		return currencyRepository.findById(id).get();
	}

	public void deleteCurrency(Long id) {
		currencyRepository.deleteById(id);
	}
}