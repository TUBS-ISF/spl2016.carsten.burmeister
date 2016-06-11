package de.tu.bs.carsten.sort.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataInput<T> {

	public List<T> readData() {
		System.out.println("Please enter your data row by row.");
		List<T> result = new ArrayList<T>();
		Scanner sc = new Scanner(System.in);
		String line;
		while ((line = sc.nextLine()) != null && !line.isEmpty()) {
			result.add((T) line);
		}
		return result;
	}
}
