package de.tu.bs.carsten.sort.data;

import java.util.List;


public class DataOutput<T>{

	public void writeData(List<T> arrayList) {
		for (T data : arrayList) {
			System.out.println(data.toString());
		}
	}

}