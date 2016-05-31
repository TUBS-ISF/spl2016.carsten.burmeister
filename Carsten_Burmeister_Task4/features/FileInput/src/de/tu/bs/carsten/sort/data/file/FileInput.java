package de.tu.bs.carsten.sort.data.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.tu.bs.carsten.sort.data.DataInput;

public class FileInput implements DataInput<String>{

	private final File file;
	

	public FileInput(){
		this.file = new File("Input.txt");
	}
	
	public FileInput(File file) {
		this.file = file;
	}
	
	@Override
	public List<String> readData() {
		try(BufferedReader reader = new BufferedReader(new FileReader(file));){
			List<String> files = new ArrayList<>();
			String line;
			while((line = reader.readLine()) != null){
				files.add(line);
			}
			return files;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
