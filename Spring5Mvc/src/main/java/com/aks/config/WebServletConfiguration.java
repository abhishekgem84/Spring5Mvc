package com.aks.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		// Create the 'root' Spring application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(AppConfig.class);
		rootContext.register(WebSecurityConfig.class);
		// Manage the lifecycle of the root application context
		servletContext.addListener(new ContextLoaderListener(rootContext));
		
		servletContext.setInitParameter("contextInitializerClasses", "com.aks.config.AppApplicationContextInitializer");
		
		// Create the dispatcher servlet's Spring application context
		AnnotationConfigWebApplicationContext dispatcherServlet = new AnnotationConfigWebApplicationContext();
		dispatcherServlet.register(WebMvcConfig.class);
		
		// Register and map the dispatcher servlet
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher",
				new DispatcherServlet(dispatcherServlet));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");

	}

}
