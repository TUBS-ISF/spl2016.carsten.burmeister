package de.tu.bs.carsten.sort.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class DataOutput<T> {

	private final File file = new File("Output.txt");

	public void writeData(List<T> arrayList) {
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

}
