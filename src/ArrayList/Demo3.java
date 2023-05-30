package ArrayList;

import java.util.ArrayList;

public class Demo3 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList<>();

		a1.add(10);
		a1.add(20);

		System.out.println(a1);

		ArrayList a2=new ArrayList<>();

		a2.addAll(a1);     // addAll() -> in collection inferface method
		a2.add(30);

		System.out.println(a2);

		/***/
		System.out.println(a2.containsAll(a1));// containAll

		/***/
		System.out.println(a2.removeAll(a1)); //removeAll
		System.out.println(a2);


	}
}
