package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo1 
{

	public static void main(String[] args) {


		HashSet h=new HashSet<>();
		h.add(300);
		h.add(1);
		h.add("java");
		h.add(null);
		h.add(1);

		System.out.println(h);

		HashSet h2=new HashSet<>(h);
		h2.add("newOne");
		System.out.println(h2);

		System.out.println(h2.isEmpty());
		System.out.println(h2.remove(null));
		System.out.println(h2);
		System.out.println(h2.contains(300));
		System.out.println(h2.containsAll(h));
		System.out.println(h2.size());
		System.out.println(h2);



	}
}

// It is not index based ..