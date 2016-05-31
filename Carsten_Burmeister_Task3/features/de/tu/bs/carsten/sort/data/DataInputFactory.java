package de.tu.bs.carsten.sort.data;



/*if[ConsoleInput]*/import de.tu.bs.carsten.sort.data.console.ConsoleInput;/*end[ConsoleInput]*/
/*if[FileInput]*/import java.io.File;import de.tu.bs.carsten.sort.data.file.FileInput;/*end[FileInput]*/

public class DataInputFactory {

	@SuppressWarnings("unchecked")
	public static <T> DataInput<T> getInput(Class<T> clazz){
		DataInput<T> di = null;
		/*if[FileInput]*/
		if(clazz.isInstance("")){
			di = (DataInput<T>) new FileInput(new File("Input.txt"));
		} else {
			throw new IllegalArgumentException("File always reads String");
		}
		/*end[FileInput]*/
		/*if[ConsoleInput]*/
		if(clazz.isInstance("")){
			di = (DataInput<T>) new ConsoleInput();
		} else {
			throw new IllegalArgumentException("Console always reads String");
		}
		/*end[ConsoleInput]*/
		
		return di;
	}
}
