package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo4 {
	public static void main(String[] args) {

		ArrayList a =new ArrayList<>();
		a.add(10);

		ArrayList b= new ArrayList<>(a);
		b.add(20);
		
		ArrayList c= new ArrayList<>(b);
		c.add(30);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		//OR
		
//		ArrayList a =new ArrayList<>();
//		a.add(10);
//		
//		ArrayList b =new ArrayList<>();
//		b.addAll(a);
//		b.add(20);
//		ArrayList c =new ArrayList<>();
//		c.addAll(b);
//		c.add(30);
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	}
}
