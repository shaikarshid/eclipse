package KeySet;

import java.util.Comparator;

public class SortRank implements Comparator<Principle> {

	@Override
	public int compare(Principle x, Principle y) {
		
		return x.rank.compareTo(y.rank);
	}

}
