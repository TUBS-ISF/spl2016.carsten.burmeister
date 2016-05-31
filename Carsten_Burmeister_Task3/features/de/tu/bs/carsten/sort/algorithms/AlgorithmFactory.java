package de.tu.bs.carsten.sort.algorithms;

public class AlgorithmFactory {
	
	static public <T> SortAlgorithm<T> getAlgorithm(Class<T> clazz){
		SortAlgorithm<T> sa = null;
		/*if[BubbleSort]*/
			sa = new BubbleSort<T>();
		/*end[BubbleSort]*/
		/*if[JavaSort]*/
			sa = new JavaSort<T>();
		/*end[JavaSort]*/
		/*if[RandomSort]*/
			sa = new RandomSort<T>();
		/*end[RandomSort]*/
			return sa;
	}
}
