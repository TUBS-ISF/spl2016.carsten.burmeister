package de.tu.bs.carsten.sort.algorithms;

public class AlgorithmFactory {
	
	static public <T> SortAlgorithm<T> getAlgorithm(Class<T> clazz){
		SortAlgorithm<T> sa = null;
		
			sa = new BubbleSort<T>();
		
		


		


			return sa;
	}
}
