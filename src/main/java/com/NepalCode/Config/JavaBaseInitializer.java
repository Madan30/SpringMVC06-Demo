package com.NepalCode.Config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class JavaBaseInitializer //implements WebApplicationInitializer 
{
	/*

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(JavaBaseConfig.class);

		// create the object of dispatcher servlet
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		// register the dispatcher servlet with servlet context
	ServletRegistration.Dynamic myCustomDispatcherServlet =	servletContext.addServlet("myFrontController",dispatcherServlet);
	myCustomDispatcherServlet.addMapping("/testing/*");
	myCustomDispatcherServlet.setLoadOnStartup(1);
		

	}
	*/
	

}
