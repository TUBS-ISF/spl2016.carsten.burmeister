package de.tu.bs.carsten.sort.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.tu.bs.carsten.sort.Logger;

public class DataInput<T> {

	public List<T> readData() {
		Logger.getInstance().log("Reading data");
		List<T> result = original();
		Logger.getInstance().log("Done reading data");
		return result;
	}

}
