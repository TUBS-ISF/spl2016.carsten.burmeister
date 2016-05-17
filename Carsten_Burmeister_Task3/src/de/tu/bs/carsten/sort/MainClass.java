package de.tu.bs.carsten.sort;


import java.util.Comparator;
import java.util.List;

import de.tu.bs.carsten.sort.algorithms.AlgorithmFactory;
import de.tu.bs.carsten.sort.algorithms.SortAlgorithm;
import de.tu.bs.carsten.sort.data.DataInput;
import de.tu.bs.carsten.sort.data.DataInputFactory;
import de.tu.bs.carsten.sort.data.DataOutput;
import de.tu.bs.carsten.sort.data.DataOutputFactory;

public class MainClass {

	/*
	 * Bisher statisch auf String gemünzt, da die weiteren Features zur Konfiguration etc. nicht existieren.
	 */
	public static void main(String[] args) {
		DataInput<String> fileInput = DataInputFactory.getInput(String.class);
		DataOutput<String> fileOutput = DataOutputFactory.getOutput(String.class);
		SortAlgorithm<String> sa = AlgorithmFactory.getAlgorithm(String.class);
		
		Comparator<String> comp = new ComparableComparator<>();
		
		List<String> data = fileInput.readData();
		sa.sort(data, comp);
		fileOutput.writeData(data);
	}

}
