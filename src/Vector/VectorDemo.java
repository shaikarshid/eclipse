package Vector;

import java.util.Vector;

public class VectorDemo
{
	public static void main(String[] args) {

		Vector v=new Vector();

		v.add("java");
		v.add(10);
		v.add(10);
		v.add(null);
		System.out.println(v);
//		for(Object i:v)
//		{
//			System.out.println(i);
//		}
		
		
		
		Vector v1=new Vector(v);
		v1.add(" painaVunnaAnniVachesai");
		
		System.out.println(v1);
		
		

	}
}
