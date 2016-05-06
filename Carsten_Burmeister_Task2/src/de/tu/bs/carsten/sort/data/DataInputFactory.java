package de.tu.bs.carsten.sort.data;

import java.io.File;

import properties.PropertyManager;
import de.tu.bs.carsten.sort.ConfigNames;
import de.tu.bs.carsten.sort.data.file.FileInput;

public class DataInputFactory {

	@SuppressWarnings("unchecked")
	public static <T> DataInput<T> getInput(Class<T> clazz){
		if(PropertyManager.getProperty(ConfigNames.FILE_INPUT.getCode())){
			if(clazz.isInstance("")){
				return (DataInput<T>) new FileInput(new File("Input.txt"));
			} else {
				throw new IllegalArgumentException("File always reads String");
			}
		} else {
			throw new UnsupportedOperationException("Die Konfiguration ist mit der aktuellen Version der Software inkompatibel.");
		}
	}
}
