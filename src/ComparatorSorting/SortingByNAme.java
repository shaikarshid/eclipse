package ComparatorSorting;

import java.util.Comparator;

public class SortingByNAme implements Comparator <Car>
{

	@Override
	public int compare(Car x, Car y) {

		return x.name.compareTo(y.name);//asscending
		
//		return y.name.compareTo(x.name);//decending
	}
}
