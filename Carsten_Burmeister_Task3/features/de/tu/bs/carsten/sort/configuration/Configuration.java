package de.tu.bs.carsten.sort.configuration;

import de.tu.bs.carsten.sort.ComparableComparator;
import java.util.Comparator;

public class Configuration {

	public static Configuration getInstance(){
		Configuration c = null;
		/*if[ConsoleConfig]*/
		c = readConsole();
		/*end[ConsoleConfig]*/
		return c;
	}

	/*if[ConsoleConfig]*/
	private static Configuration readConsole(){
		Configuration c;
		/*if[SortAscending]*/
		/*if[FileInput]*/
		c = new Configuration(new ComparableComparator<String>());
		/*end[FileInput]*/
		/*if[ConsoleInput]*/
		c = new Configuration(new ComparableComparator<String>());
		/*end[ConsoleInput]*/
		/*end[SortAscending]*/
		return c;
	}
	/*end[ConsoleConfig]*/
	
	private Comparator<?> comparator;
	
	public Comparator<?> getComparator(){
		return comparator;
	}
	
	public Configuration(Comparator<?> comparator){
		this.comparator = comparator;
	}
}
