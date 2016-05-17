package de.tu.bs.carsten.sort.data.console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import de.tu.bs.carsten.sort.data.DataInput;

public class ConsoleInput implements DataInput<String> {

	@Override
	public List<String> readData() {
		List<String> result = new ArrayList<>();
		try (Scanner sc = new Scanner(System.in);) {
			String line;
			while ((line = sc.nextLine()) != null && !line.isEmpty()) {
				result.add(line);
			}
		}
		return result;
	}
}
