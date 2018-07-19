package com.aks.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class AppApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext ac) {
		ConfigurableEnvironment appEnvironment = ac.getEnvironment();
		appEnvironment.addActiveProfile("DEV");

	}
}
