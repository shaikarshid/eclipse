package ComparatorSorting;

import java.util.Comparator;

public class SortMarks implements Comparator<Student> {

	@Override
	public int compare(Student x, Student y) {
		
//		return x.marks.compareTo(y.marks);/ass
		return y.marks.compareTo(x.marks);
	}

}
