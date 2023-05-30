package TreeSet;

import java.util.TreeSet;

public class Demo1 
{
	public static void main(String[] args) 
	{
		
		TreeSet t=new TreeSet();
		
		t.add(1);
		t.add(5);
		t.add(7);
		t.add(0);
	
	
	
		System.out.println(t);
		
	}
}
// It takes only homogeneous  data...
// Natural Sorting 
//when we add an object into treeset internally  compareTo() get called..
//