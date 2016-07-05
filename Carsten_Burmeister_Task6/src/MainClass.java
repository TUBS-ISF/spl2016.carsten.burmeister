 


import java.io.File;
import java.util.Comparator;
import java.util.List;

public  class  MainClass {
	

	public static void main(String[] args) {
		DataInput<String> fileInput = new FileInput(new File("input.txt"));
		DataOutput<String> fileOutput = new FileOutput(new File("output.txt"));
		SortAlgorithm<String> sa = new JavaSort<String>();
		
		Comparator<String> comp = new ComparableComparator<String>();
		
		List<String> data = fileInput.readData();
		sa.sort(data, comp);
		fileOutput.writeData(data);
	}


}
