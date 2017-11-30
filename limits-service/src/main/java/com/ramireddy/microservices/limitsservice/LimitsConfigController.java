package com.ramireddy.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramireddy.microservices.beans.LimitsConfig;

@RestController
public class LimitsConfigController {
	
	@Autowired
	private Configurations config;
	
	@GetMapping("/limits")
	public LimitsConfig retrivalLimitsFromConfiguration() {
		return new LimitsConfig(config.getMinimum(),config.getMaximum());
	}

}
