package de.tu.bs.carsten.sort.data;


/*if[ConsoleInput]*/import de.tu.bs.carsten.sort.data.console.ConsoleOutput;/*end[ConsoleInput]*/
/*if[FileInput]*/import java.io.File; import de.tu.bs.carsten.sort.data.file.FileOutput;/*end[FileInput]*/

public class DataOutputFactory {

	@SuppressWarnings("unchecked")
	public static <T> DataOutput<T> getOutput(Class<T> clazz) {
		/*if[FileInput]*/
		if (clazz.isInstance("")) {
			return (DataOutput<T>) new FileOutput(new File("Output.txt"));
		} else {
			throw new IllegalArgumentException("File always writes String");
		}
		/*end[FileInput]*/
		/*if[ConsoleInput]*/
			return new ConsoleOutput<T>();
		/*end[ConsoleInput]*/
	}
}
