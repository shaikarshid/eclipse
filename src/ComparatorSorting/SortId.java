package ComparatorSorting;

import java.util.Comparator;

public class SortId implements Comparator<Student>
{

	@Override
	public int compare(Student x,Student y)
	{
//		return x.id.compareTo(y.id);//ass
		return y.id.compareTo(x.id);// des
		
	}
}
                             