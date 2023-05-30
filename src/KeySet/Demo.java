package KeySet;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class Demo
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> m=new LinkedHashMap<>();
		m.put(1, "arshid");
		m.put(2, "sravan");
		m.put(3, "javeed");
		m.put(4, "bablu");
		m.put(5, "vivek");

//		System.out.println(m); //{1=arshid, 2=sravan, 3=javeed, 4=bablu, 5=vivek}

		Set<Integer> keys=m.keySet();      //keys->[1,2,3,4,5]
		
		for(int i:keys)
		{
		System.out.println( i+ " "+ m.get(i)); // names print hoote
			
		}
		
	}
}

/**keySet() method present in map  interface .Demo.
keySet : it is used to retern the set of keys ..

return type is Set...

key set present in util package

syntax :    Set <generics> referencetype= mapreference.keyset();*/