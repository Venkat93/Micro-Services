package com.ramireddy.microservices.currencyconversionservice;

public class CurrencyConversionBean {
	
	private String from;
	private String to;
	private int conversionRate;
	private int port;
	public CurrencyConversionBean(String from, String to, int conversionRate, int port, int amount, int finalamount) {
		super();
		this.from = from;
		this.to = to;
		this.conversionRate = conversionRate;
		this.port = port;
		this.amount = amount;
		this.finalamount = finalamount;
	}
	private int amount;
	private int finalamount;
	
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getFinalamount() {
		return finalamount;
	}
	public void setFinalamount(int finalamount) {
		this.finalamount = finalamount;
	}
	
	public CurrencyConversionBean() {
		super();
	}
	@Override
	public String toString() {
		return "CurrencyConversionBean [from=" + from + ", to=" + to + ", conversionRate=" + conversionRate
				+ ", amount=" + amount + ", finalamount=" + finalamount + "]";
	}
	
	
	
	

}
