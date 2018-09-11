package com.rickydanzberger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class CensusReport 

{

	private List<CensusReportDataRow> rows = new ArrayList<>();
	
	@Value("${report.filename}")
	private String filename;
	
	private FileProcessorService fps;
	
	public void generateReport ()
	{
		
	this.setRows(fps.processfile(filename));
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
