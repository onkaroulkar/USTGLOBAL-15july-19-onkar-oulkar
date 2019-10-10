package com.ust.springrest.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration                                             //Controller
public class ORMConfig {

	@Bean             // it is a  bean method
	public LocalEntityManagerFactoryBean ormConfig() {
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();        //same as EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee-unit");
		bean.setPersistenceUnitName("employee-unit");
		return bean;
	}
	
}
