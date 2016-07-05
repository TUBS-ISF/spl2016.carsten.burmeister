

import java.util.Comparator;
import java.util.List;

public class BubbleSort<T> implements SortAlgorithm<T>{

	@SuppressWarnings("unchecked")
	@Override
	public void sort(List<T> sort, Comparator<T> comp) {
		Object[] array = sort.toArray(new Object[0]);
		
		Object o;
		for (int i = array.length; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				T o1 = (T) array[j];
				T o2 = (T) array[j+1];
				int result = comp.compare(o1, o2);
				if(result > 0){
					o = array[j+1];
					array[j+1] = array[j];
					array[j] = o;
				}
			}
		}
		sort.clear();
		for (Object object : array) {
			T t = (T) object;
			sort.add(t);
		}
	}
	
}
