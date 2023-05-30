package KeySet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

public class Employee1Main {
	public static void main(String[] args) {


		Employee1 e1=new Employee1(1, "car", 2.3);
		Employee1 e2=new Employee1(2, "are", 3.3);
		Employee1 e3=new Employee1(3, "bar", 1.3);

		LinkedHashMap<Integer, Employee1> m= new LinkedHashMap<>();
		m.put(e1.id, e1);
		m.put(e2.id, e2);
		m.put(e3.id, e3);

		Set<Integer> keys=	m.keySet();

		ArrayList<Employee1> a=new ArrayList<>();

		for (Integer i : keys) 
		{
			a.add(m.get(i));

		}
		
		Collections.sort(a);
		
		for(Employee1 ans: a)
		{
			System.out.println(ans);
		}


	}
}
