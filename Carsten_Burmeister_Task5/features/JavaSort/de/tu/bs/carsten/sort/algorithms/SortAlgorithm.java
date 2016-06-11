package de.tu.bs.carsten.sort.algorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAlgorithm<T>{

	public void sort(List<T> sort, Comparator<T> comp) {
		Collections.sort(sort,comp);
	}

}
