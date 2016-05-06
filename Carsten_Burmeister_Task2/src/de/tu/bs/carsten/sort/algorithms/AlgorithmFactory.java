package de.tu.bs.carsten.sort.algorithms;

import de.tu.bs.carsten.sort.ConfigNames;
import properties.PropertyManager;

public class AlgorithmFactory {
	
	static public <T> SortAlgorithm<T> getAlgorithm(Class<T> clazz){
		if(PropertyManager.getProperty(ConfigNames.BUBBLE_SORT.getCode())){
			return new BubbleSort<T>();
		} else if(PropertyManager.getProperty(ConfigNames.JAVA_SORT.getCode())){
			return new JavaSort<T>();
		} else if(PropertyManager.getProperty(ConfigNames.RANDOM_SORT.getCode())){
			return new RandomSort<T>();
		} else {
			throw new UnsupportedOperationException("Die Konfiguration ist mit der aktuellen Version der Software inkompatibel.");
		}
	}
}
