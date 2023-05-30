package LinkedHashSet;

import java.util.LinkedHashSet;

public class Demo1 
{
	public static void main(String[] args) {

		LinkedHashSet l=new LinkedHashSet();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(2);
		System.out.println(l);
		
		LinkedHashSet l2=new LinkedHashSet(l);
		l2.add(6);
		l2.add(null);
		l2.add("java");
		
		System.out.println(l2);
	

	}
}
// inserction order is maintain -> normaly set is notmainatain bur LinkedHAsMAp is maintiain ..