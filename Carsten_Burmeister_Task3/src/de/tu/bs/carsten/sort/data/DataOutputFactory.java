package de.tu.bs.carsten.sort.data;


import de.tu.bs.carsten.sort.data.console.ConsoleOutput;


public class DataOutputFactory {

	@SuppressWarnings("unchecked")
	public static <T> DataOutput<T> getOutput(Class<T> clazz) {
		DataOutput<T> dOut = null;
		






		
			dOut = new ConsoleOutput<T>();
		
		return dOut;
	}
}
