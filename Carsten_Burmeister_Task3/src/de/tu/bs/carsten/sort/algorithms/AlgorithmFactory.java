package de.tu.bs.carsten.sort.algorithms;

public class AlgorithmFactory {
	
	static public <T> SortAlgorithm<T> getAlgorithm(Class<T> clazz){
		
			return new BubbleSort<T>();
		
		


		


	}
}
