package com.rickydanzberger.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rickydanzberger.CensusReport;

@Controller
public class CrimeReportController 

{
	
	@Autowired
	private CensusReport censusReport;
	
	
	@RequestMapping("/report")
	public String showReport(ModelMap model)
	{
		censusReport.generateReport();
		model.put("rows", censusReport.getRows());
		
		return "report";
	}
}
