package de.tu.bs.carsten.sort.data;

import java.io.File;

import de.tu.bs.carsten.sort.data.console.ConsoleOutput;


public class DataOutputFactory {

	@SuppressWarnings("unchecked")
	public static <T> DataOutput<T> getOutput(Class<T> clazz) {
		






		
			return new ConsoleOutput<T>();
		
	}
}
