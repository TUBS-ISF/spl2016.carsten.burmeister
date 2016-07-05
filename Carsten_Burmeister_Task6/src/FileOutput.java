

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOutput implements DataOutput<String>{

	private final File file;
	
	public FileOutput(File file) {
		this.file = file;
	}
	
	@Override
	public void writeData(List<String> arrayList) {
		file.delete();
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file));){
			for (String string : arrayList) {
				writer.write(string);
				writer.newLine();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
