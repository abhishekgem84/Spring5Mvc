package com.aks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Profile(value = "DEV")
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.aks")
@PropertySource(value = "classpath:application.properties")
public class WebMvcConfig implements WebMvcConfigurer {

	@Bean
	public ViewResolver viewresolver() {
		InternalResourceViewResolver irv = new InternalResourceViewResolver();
		irv.setViewClass(JstlView.class);
		irv.setPrefix("/WEB-INF/jsp/");
		irv.setSuffix(".jsp");
		return irv;
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
	}
}