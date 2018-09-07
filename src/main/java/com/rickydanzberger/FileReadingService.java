package com.rickydanzberger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FileReadingService {

	public List<String> readfile (String filename)
	{
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}
}
