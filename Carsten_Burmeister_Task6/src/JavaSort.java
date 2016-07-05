

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaSort<T> implements SortAlgorithm<T>{

	@Override
	public void sort(List<T> sort, Comparator<T> comp) {
		Collections.sort(sort,comp);
	}

}
