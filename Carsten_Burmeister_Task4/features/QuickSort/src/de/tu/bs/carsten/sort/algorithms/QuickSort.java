package de.tu.bs.carsten.sort.algorithms;

import java.util.Comparator;
import java.util.List;

public class QuickSort<T> implements SortAlgorithm<T> {

	@SuppressWarnings("unchecked")
	@Override
	public void sort(List<T> sort, Comparator<T> comp) {
		Object[] array = sort.toArray(new Object[0]);
		quickSort(array, comp, 0, sort.size() - 1);
		sort.clear();
		for (Object object : array) {
			T t = (T) object;
			sort.add(t);
		}
	}

	private void quickSort(Object[] sort, Comparator<T> comp, int left, int right) {
		if (left < right) {
			int middle = split(sort, comp, left, right);
			quickSort(sort, comp, left, middle - 1);
			quickSort(sort, comp, middle + 1, right);
		}
	}

	private int split(Object[] sort, Comparator<T> comp, int links, int rechts) {
		Object pivot;
		int i, j;
		pivot = sort[rechts];
		i = links;
		j = rechts - 1;
		while (i <= j) {
			if (compare(sort[i],pivot,comp) > 0) {
				swap(sort,i,j);
				j--;
			} else
				i++;
		}
		swap(sort, i,rechts);
		
		return i;
	}
	
	private void swap(Object[] sort, int i, int j){
		Object helper;
		helper = sort[i];
		sort[i] = sort[j];
		sort[j] = helper;
	}

	@SuppressWarnings("unchecked")
	private int compare(Object v1, Object v2, Comparator<T> comp){
		return comp.compare((T) v1, (T) v2);
	}
}
