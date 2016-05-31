package de.tu.bs.carsten.sort.data;



import de.tu.bs.carsten.sort.data.console.ConsoleInput;


public class DataInputFactory {

	@SuppressWarnings("unchecked")
	public static <T> DataInput<T> getInput(Class<T> clazz){
		DataInput<T> di = null;
		






		
		if(clazz.isInstance("")){
			di = (DataInput<T>) new ConsoleInput();
		} else {
			throw new IllegalArgumentException("Console always reads String");
		}
		
		
		return di;
	}
}
