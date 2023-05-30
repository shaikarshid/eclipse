package ComparatorSorting;

import java.util.Comparator;

public class SortingById implements Comparator<Car>
{
	@Override
	public int compare(Car x,Car y)
	{
		return x.id.compareTo(y.id);//asscending
		
//		return y.id.compareTo(x.id);//descending
	}



}
//already existing Object
//Object to be inserted//