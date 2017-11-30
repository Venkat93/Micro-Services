package com.ramireddy.microservices.currencyconversionservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	@GetMapping("/CurrencyConvert/from/{from}/to/{to}/amount/{amount}")
	public CurrencyConversionBean getConvertedAmount(@PathVariable String from, @PathVariable String to, @PathVariable int amount) {
		
		CurrencyConversionBean response=proxy.exchange(from, to);
		
		return new CurrencyConversionBean(from, to, response.getConversionRate(),response.getPort(), amount,amount*response.getConversionRate());
		
		//CurrencyConversionBean ccBean= new CurrencyConversionBean(from,to,Integer.parseInt(amount),65);
		//ccBean.setFinalamount(ccBean.getConversionRate()*ccBean.getAmount());
		//return ccBean;
		
	}

}




