package ArrayList;
//Practice 
import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {


		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10);
		a.add("hello");
		a.add(null);
		System.out.println(a);
		
		// collection method..
				a.remove(3);
				System.out.println(a);
				System.out.println(a.contains(10));
				System.out.println(a.size());
				System.out.println(a.isEmpty());
				System.out.println(a);

				//  list  method..
				
				System.out.println(a.get(0));
				System.out.println(a.indexOf("hello"));
				System.out.println(a.lastIndexOf(10));
				a.add(3, "newhello");
				System.out.println(a);
				System.out.println(a.set(0, 100));
				System.out.println(a);
				
	}
}
