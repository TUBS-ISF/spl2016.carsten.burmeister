package de.tu.bs.carsten.sort; 


import java.util.Comparator; 
import java.util.List; 

import de.tu.bs.carsten.sort.algorithms.SortAlgorithm; 
import de.tu.bs.carsten.sort.data.DataInput; 
import de.tu.bs.carsten.sort.data.DataOutput; 

public  class  MainClass {
	

	public static void main(String[] args) {
		DataInput<String> fileInput = new DataInput<String>();
		DataOutput<String> fileOutput = new DataOutput<String>();
		SortAlgorithm<String> sa = new SortAlgorithm<String>();
		
		Comparator<String> comp = new ComparableComparator<String>();
		
		List<String> data = fileInput.readData();
		sa.sort(data, comp);
		fileOutput.writeData(data);
	}


}
