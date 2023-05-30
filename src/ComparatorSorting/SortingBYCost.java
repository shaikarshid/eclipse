package ComparatorSorting;

import java.util.Comparator;

public class SortingBYCost implements Comparator<Car> 
{

	@Override
	public int compare(Car x, Car y)
	{
		
		return x.cost.compareTo(y.cost);//asscending
		
	
//		return y.cost.compareTo(x.cost);//decending
	}

}
