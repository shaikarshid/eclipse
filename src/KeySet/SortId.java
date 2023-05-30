package KeySet;

import java.util.Comparator;

public class SortId  implements Comparator<Principle> {

	@Override
	public int compare(Principle x, Principle y) {
		
		return x.id.compareTo(y.id);
	}

}
