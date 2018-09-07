package com.rickydanzberger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileProcessorService {

	@Autowired
	FileReadingService frs;

	public void processfile() {
		//frs = new FileReadingService();
		List<String> lines = frs.readfile("2010_Census_Populations_by_Zip_Code.csv");
		for (String line : lines) {
			System.out.println(line);
		}
	}

}
