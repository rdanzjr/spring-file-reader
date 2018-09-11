package com.rickydanzberger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")

public class FileReadingApp {
	
	@Bean
	static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer ()

	{
		return new PropertySourcesPlaceholderConfigurer();
	}
	public static void main (String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(FileReadingApp.class);
		
		
		CensusReport censusReport = (CensusReport) context.getBean("censusReport");	
		
		censusReport.generateReport();
		
		for (CensusReportDataRow row : censusReport.getRows())
		{
			System.out.println(row);
		}
		
	//	fps.processfile();
	}
	

}

