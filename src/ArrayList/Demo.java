package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("java");
		a.add(10);
		a.add(null);

		for(Object i:a)
		{
			System.out.println((i));
		}
		//OR
		//		System.out.println(a);

		//List methods

				System.out.println(a.get(0));
				System.out.println(a.size());
				System.out.println(a.indexOf("java"));
				System.out.println(a.lastIndexOf(10));
				a.set(3, "SetKaresoAtParticalposion");
				a.add(4, "arshid");
				a.add(5, " innfinate");
				
				System.out.println(a);


		//Collection methods

		//		a.add(10);
		//		a.add("java");
		//		a.add(10);
		//		a.add(null);
		//		a.add("deleted");
		//		a.add(0);
		//
		//		System.out.println(a);
		//
		//		System.out.println(a.remove("deleted"));
		//		System.out.println(a.remove(1));
		//		System.out.println(a.contains("java"));
		//		System.out.println(a.size());
		//
		//		System.out.println(	a.isEmpty());
		//
		//
		//		a.clear();
		//		System.out.println(a);



		//		Iterator<Object> i=a.iterator();   // traveing purpose  kosam  used chestam  iterator
		//
		//		while(i.hasNext())
		//		{
		//			System.out.println(i.next());
		//		}








	}



}
