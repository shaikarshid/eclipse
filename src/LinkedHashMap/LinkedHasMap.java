package LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHasMap {

	public static void main(String[] args) {


		LinkedHashMap<Double, String> m =new LinkedHashMap<>();
		m.put(1.1,"hello");
		m.put(2.2, "hiii");
		m.put(null, "null");
		m.put(3.3, "bye");
		
		System.out.println(m);
		System.out.println(m.get(2.2));
		
		System.out.println(m.isEmpty());
		
		System.out.println(m.size());
		
		System.out.println(m.containsKey(1.1));
		
		System.out.println(m.remove(null));
		
		System.out.println(m);
		






	}
}
// inserction order is maintain
