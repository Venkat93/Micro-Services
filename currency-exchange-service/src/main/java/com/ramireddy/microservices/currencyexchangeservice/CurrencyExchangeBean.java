package com.ramireddy.microservices.currencyexchangeservice;



import org.springframework.stereotype.Component;

@Component
public class CurrencyExchangeBean {
	
	private String from;
	private String to;
	private int conversionRate;
	private int port;
	public String getFrom() {
		return from;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	
	public CurrencyExchangeBean(String from, String to, int conversionRate) {
		super();
		this.from = from;
		this.to = to;
		this.conversionRate = conversionRate;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(int conversionRate) {
		this.conversionRate = conversionRate;
	}
	public CurrencyExchangeBean() {
		super();
	}
	@Override
	public String toString() {
		return "CurrencyExchangeBean [from=" + from + ", to=" + to + ", conversionRate=" + conversionRate + "]";
	}
	
	
	
	

}
