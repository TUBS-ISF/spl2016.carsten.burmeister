package de.tu.bs.carsten.sort.configuration;

import de.tu.bs.carsten.sort.ComparableComparator;
import java.util.Comparator;

public class Configuration {

	public static Configuration getInstance(){
		Configuration c = null;
		
		c = readConsole();
		
		return c;
	}

	
	private static Configuration readConsole(){
		Configuration c;
		
		


		
		c = new Configuration(new ComparableComparator<String>());
		
		
		return c;
	}
	
	
	private Comparator<?> comparator;
	
	public Comparator<?> getComparator(){
		return comparator;
	}
	
	public Configuration(Comparator<?> comparator){
		this.comparator = comparator;
	}
}
