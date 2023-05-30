package KeySet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

public class PrincipleMain {
	public static void main(String[] args) {


		Principle p1=new Principle(1, "ccc",2.2 );
		Principle p2=new Principle(2, "bcc",3.2 );
		Principle p3=new Principle(3, "acc",1.2 );

		LinkedHashMap<Integer, Principle> m=  new LinkedHashMap();

		m.put(p1.id, p1);
		m.put(p2.id, p2);
		m.put(p3.id, p3);

		Set<Integer> keys=	m.keySet();

		ArrayList<Principle> a=new ArrayList<>();

		for(Integer i: keys)
		{
			a.add(m.get(i));	
		}
		
	//	sorting Object class
		SortId id=new SortId();
		SortName name= new SortName();
		SortRank rank=new SortRank();
		
		Collections.sort(a,name);
		
		
	         for (Principle ans: a)//System.out.println(a);
	         {
	        	 System.out.println(ans);
	         }
	}
}
