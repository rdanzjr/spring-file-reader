package com.rickydanzberger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class CensusReport 

{

	private List<CensusReportDataRow> rows = new ArrayList<>();
	
	@Value("${report.filename}")
	private String filename;
	
	@Autowired
	@Qualifier("descReport")
	private CensusReportResult censusReportResult;
	
	private FileProcessorService fps;
	
	public void generateReport ()
	{
		System.out.println("Loading filename: " + filename);
		this.setRows(fps.processfile(filename));
	    System.out.println(censusReportResult.getSorting());
		
		
	
	}
	
	public List<CensusReportDataRow> getRows() {
		return rows;
	}

	public void setRows(List<CensusReportDataRow> rows) {
		this.rows = rows;
	}
	
	@Autowired
	public void setFileProcessorService(FileProcessorService fps)
	{
		this.fps = fps;
	}
	
	
	
}
