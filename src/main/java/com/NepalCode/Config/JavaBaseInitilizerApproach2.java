package com.NepalCode.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class JavaBaseInitilizerApproach2 extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// pass the java class
		Class arr[] = { JavaBaseConfig.class };
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = { "/testing/*" };
		return arr;
	}

}
