package com.ramireddy.microservices.beans;

public class LimitsConfig {
	
	private int minimum;
	private int maximum;
	
	public int getMinimum() {
		return minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public LimitsConfig(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	protected LimitsConfig() {
		super();
	}
	@Override
	public String toString() {
		return "LimitsConfig [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
	
	
	

}
