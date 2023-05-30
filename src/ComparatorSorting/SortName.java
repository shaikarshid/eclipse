package ComparatorSorting;

import java.util.Comparator;

public class SortName implements Comparator<Student> {

	@Override
	public int compare(Student x, Student y) {
	
//		return x.name.compareTo(y.name);//asscending
		return y.name.compareTo(x.name);//decending 
	}

}
