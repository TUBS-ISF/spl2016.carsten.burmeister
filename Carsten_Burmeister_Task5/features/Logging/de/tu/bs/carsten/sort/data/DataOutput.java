package de.tu.bs.carsten.sort.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import de.tu.bs.carsten.sort.Logger;

public class DataOutput<T> {

	public void writeData(List<T> arrayList) {
		Logger.getInstance().log("Writing output");
		original(arrayList);
		Logger.getInstance().log("Done with output");
	}

}
