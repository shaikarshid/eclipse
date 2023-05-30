package HashMap;

import java.util.HashMap;

public class Demo
{
	public static void main(String[] args) 
	{
		HashMap m= new HashMap<>();
		m.put(1,"java");
		m.put(2, 10);
		m.put(3, 10);
		m.put(3, null);
		m.put(5, 9.0);
		m.put(null, "null value stored as a key");
		

		System.out.println(m);
		//map functions
		
		System.out.println(m.remove(4));
		System.out.println(m);

		System.out.println(m.get(1));

		System.out.println(m.containsKey(5));
		System.out.println(m.containsKey(4));

		System.out.println(m.containsValue(10));
		System.out.println(m.containsValue(null));

		System.out.println(m.size());

		System.out.println(m.isEmpty());
//		

	}
}
// 
//Keys &values..
// value can be duplicated  but key doesnt duplicated 
// if we have duplicated key the value should be ovverridden..
// inserction order is not mAINtain