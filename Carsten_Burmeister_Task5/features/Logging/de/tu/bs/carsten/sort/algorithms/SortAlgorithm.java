package de.tu.bs.carsten.sort.algorithms;

import java.util.Comparator;
import java.util.List;
import de.tu.bs.carsten.sort.Logger;

public class SortAlgorithm<T> {

	public void sort(List<T> sort, Comparator<T> comp) {
		Logger.getInstance().log("Starting to sort");
		original(sort,comp);
		Logger.getInstance().log("Done sorting");
	}
	
}
