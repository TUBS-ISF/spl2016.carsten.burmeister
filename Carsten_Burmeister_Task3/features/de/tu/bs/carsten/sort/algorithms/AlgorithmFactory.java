package de.tu.bs.carsten.sort.algorithms;

public class AlgorithmFactory {
	
	static public <T> SortAlgorithm<T> getAlgorithm(Class<T> clazz){
		/*if[BubbleSort]*/
			return new BubbleSort<T>();
		/*end[BubbleSort]*/
		/*if[JavaSort]*/
			return new JavaSort<T>();
		/*end[JavaSort]*/
		/*if[RandomSort]*/
			return new RandomSort<T>();
		/*end[RandomSort]*/
	}
}
