package de.tu.bs.carsten.sort.data; 

import java.io.BufferedWriter; 
import java.io.File; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Iterator; 
import java.util.List; 

import de.tu.bs.carsten.sort.Logger; 

public   class  DataOutput <T> {
	

	 private void  writeData__wrappee__FileOutput  (List<T> arrayList) {
		file.delete();
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(file));
			for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
				T t = (T) iterator.next();
				writer.write(t.toString());
				writer.newLine();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	

	public void writeData(List<T> arrayList) {
		Logger.getInstance().log("Writing output");
		writeData__wrappee__FileOutput(arrayList);
		Logger.getInstance().log("Done with output");
	}

	

	private final File file = new File("Output.txt");


}
