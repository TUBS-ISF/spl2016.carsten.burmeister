package de.tu.bs.carsten.sort.data.console;

import java.util.List;

import de.tu.bs.carsten.sort.data.DataOutput;

public class ConsoleOutput<T> implements DataOutput<T>{

	@Override
	public void writeData(List<T> arrayList) {
		for (T data : arrayList) {
			System.out.println(data.toString());
		}
	}

}