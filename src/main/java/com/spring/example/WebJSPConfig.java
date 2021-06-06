package com.spring.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.spring.example")
public class WebJSPConfig {
	

	@Bean(name ="viewResolver")
	public InternalResourceViewResolver getResolver()
	{
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
		
	}
}
