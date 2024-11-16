package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterUtil {

	public static double convertSalary(double salary,String country) {

		switch (country) {
		case "USD":
			salary = salary* 0.012;
			break;
		case "EUR":
			salary = salary* 0.011;
			break;
		case "GBP":
			salary = salary* 0.0098;
			break;
		case "AUD":
			salary = salary* 0.019;
			break;
		case "JPY":
			salary = salary* 1.78;
			break;
		default:
			salary = salary * 1;
			break;
		}
		return salary;
	}
}