package de.tu.bs.carsten.sort.data;

import java.io.File;

import de.tu.bs.carsten.sort.data.console.ConsoleInput;


public class DataInputFactory {

	@SuppressWarnings("unchecked")
	public static <T> DataInput<T> getInput(Class<T> clazz){
		






		
		if(clazz.isInstance("")){
			return (DataInput<T>) new ConsoleInput();
		} else {
			throw new IllegalArgumentException("Console always reads String");
		}
		
	}
}
