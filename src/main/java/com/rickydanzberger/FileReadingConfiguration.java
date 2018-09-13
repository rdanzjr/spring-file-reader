package com.rickydanzberger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@EnableAutoConfiguration

public class FileReadingConfiguration {
	
	@Bean
	static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer (Environment env)

	{
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
	public static void main (String[] args)
	{
//		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(FileReadingConfiguration.class);
		SpringApplication.run(FileReadingConfiguration.class, args);
		
		
	}
	

}

