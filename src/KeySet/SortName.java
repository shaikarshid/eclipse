package KeySet;

import java.util.Comparator;

public class SortName implements Comparator<Principle> {

	@Override
	public int compare(Principle x, Principle y) {
		
		return x.name.compareTo(y.name);
	}

}

