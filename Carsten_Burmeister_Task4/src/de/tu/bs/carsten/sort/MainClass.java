package de.tu.bs.carsten.sort;


import java.util.Comparator;
import java.util.List;

import de.tu.bs.carsten.sort.algorithms.SortAlgorithm;
import de.tu.bs.carsten.sort.data.DataInput;
import de.tu.bs.carsten.sort.data.DataOutput;
import loader.PluginLoader;

public class MainClass {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List<DataInput> fileInput = PluginLoader.load(DataInput.class);
		List<DataOutput> fileOutput = PluginLoader.load(DataOutput.class);
		List<SortAlgorithm> sa = PluginLoader.load(SortAlgorithm.class);
		
		Comparator<String> comp = new ComparableComparator<>();
		
		List data = fileInput.get(0).readData();
		sa.get(0).sort(data, comp);
		fileOutput.get(0).writeData(data);
	}

}
