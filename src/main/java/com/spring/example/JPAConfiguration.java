package com.spring.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.spring.example")
public class JPAConfiguration {

	public LocalEntityManagerFactoryBean entityManagerFactory()
	{
		LocalEntityManagerFactoryBean factoryBean=new LocalEntityManagerFactoryBean();
		//persistence xml => class linke =>businesssalesPersistence
		factoryBean.setPersistenceUnitName("businesssalesPersistence");
		return factoryBean;
	}
}
