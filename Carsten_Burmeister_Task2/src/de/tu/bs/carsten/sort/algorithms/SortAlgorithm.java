package de.tu.bs.carsten.sort.algorithms;

import java.util.Comparator;
import java.util.List;

public interface SortAlgorithm<T> {
	
	void sort(List<T> sort, Comparator<T> comp);
}
