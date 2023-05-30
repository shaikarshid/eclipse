package LinkedList;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		l.add(20);
		l.add(20);
		l.add("java");
		l.add(null);
		l.add(46.0);
		
		System.out.println(l);
		
//		System.out.println(l.get(0)); //single  singlr print aata 
		
		
//		for(int i=0;i<l.size();i++)  // och  ye haito ooch ajata 
//		{
//			System.out.println(l.get(i));
//		}
		
		
		/***REverse print karne */
//		for(int i=l.size()-1;i>=0;i--)
//		{
//			System.out.println(l.get(i));
//		}
		
		/** FOr each loop */
		for(Object i:l)
		{
			System.out.println(i);
		}
		

	}
}
//ArrayList mey haiso sobhi work hoote  ismeybhii -> collection method & list methods
/** ek bar arrayList Demo program dhek */
