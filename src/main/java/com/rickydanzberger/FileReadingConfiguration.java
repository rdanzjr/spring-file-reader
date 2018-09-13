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
	
	@Bean
	@Qualifier("ascReport")
	static CensusReportResult censusReportResultAsc ()
	{
		return new CensusReportResult("asc");
	}
	
	@Bean
	@Qualifier("descReport")
	static CensusReportResult crimeReportResultDesc ()
	{
		return new CensusReportResult("desc");
	}
	
	public static void main (String[] args)
	{
//		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(FileReadingConfiguration.class);
		ConfigurableApplicationContext context = SpringApplication.run(FileReadingConfiguration.class, args);
		
		List<CensusReport> reports = new ArrayList<>();
		
		reports.add((CensusReport) context.getBean("censusReport"));
		reports.add((CensusReport) context.getBean("censusReport"));
		reports.add((CensusReport) context.getBean("censusReport"));
		reports.add((CensusReport) context.getBean("censusReport"));
		reports.add((CensusReport) context.getBean("censusReport"));
		
//		CensusReport censusReport = (CensusReport) context.getBean("censusReport");	
		for (CensusReport report : reports)
		{
			report.generateReport();
			System.out.println(report);
			
		}
		
		
//		for (CensusReportDataRow row : censusReport.getRows())
//		{
//			System.out.println(row);
//		}
		
	//	fps.processfile();
	}
	

}

