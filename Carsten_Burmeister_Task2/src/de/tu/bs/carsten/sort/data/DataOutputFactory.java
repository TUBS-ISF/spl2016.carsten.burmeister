package de.tu.bs.carsten.sort.data;

import java.io.File;

import properties.PropertyManager;
import de.tu.bs.carsten.sort.ConfigNames;
import de.tu.bs.carsten.sort.data.file.FileOutput;

public class DataOutputFactory {

	@SuppressWarnings("unchecked")
	public static <T> DataOutput<T> getOutput(Class<T> clazz){
		if(PropertyManager.getProperty(ConfigNames.FILE_OUTPUT.getCode())){
			if(clazz.isInstance("")){
				return (DataOutput<T>) new FileOutput(new File("Output.txt"));
			} else {
				throw new IllegalArgumentException("File always writes String");
			}
		} else {
			throw new UnsupportedOperationException("Die Konfiguration ist mit der aktuellen Version der Software inkompatibel.");
		}
	}
}
