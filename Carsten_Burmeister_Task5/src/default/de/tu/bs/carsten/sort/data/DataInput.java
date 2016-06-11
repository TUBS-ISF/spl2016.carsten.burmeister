package de.tu.bs.carsten.sort.data; 

import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.List; 

import de.tu.bs.carsten.sort.Logger; 

public   class  DataInput <T> {
	

	 private List<T>  readData__wrappee__FileInput  () {
		List<T> files = new ArrayList<T>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				files.add((T) line);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return files;
	}

	

	public List<T> readData() {
		Logger.getInstance().log("Reading data");
		List<T> result = readData__wrappee__FileInput();
		Logger.getInstance().log("Done reading data");
		return result;
	}

	

	private final File file = new File("Input.txt");


}
