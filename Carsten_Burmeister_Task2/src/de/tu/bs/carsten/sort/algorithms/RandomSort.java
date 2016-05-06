package de.tu.bs.carsten.sort.algorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RandomSort<T> implements SortAlgorithm<T>{

	@Override
	public void sort(List<T> sort, Comparator<T> comp) {
		boolean sorted;
		do {
			sorted = true;
			Collections.shuffle(sort);
			T t1 = sort.get(0);
			for (int i = 1; i < sort.size(); i++) {
				T t2 = sort.get(i);
				if(comp.compare(t1, t2) > 0){
					sorted = false;
					break;
				} 
				t1 = t2;
			}
		} while (!sorted);
	}

}
