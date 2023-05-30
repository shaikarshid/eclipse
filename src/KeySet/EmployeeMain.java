package KeySet;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1=new Employee(1,"cherry", 2.2);
		Employee e2= new Employee(2,"arshid",3.3 );
		Employee e3=new Employee(3,"bablu", 1.1);

		LinkedHashMap<Integer,Employee>  m= new LinkedHashMap<>();
		// employee id as a key 
		// employee object as a  values

		m.put(e1.id, e1);
		m.put(e2.id, e2);
		m.put(e3.id, e3);

		Set<Integer> keys = m.keySet();

		TreeSet<Employee> t=new TreeSet<>();

		for(Integer i: keys)
		{
			//			System.out.println(m.get(i));
			t.add(m.get(i));
		}
		
		
		for(Employee ans: t)
		{
			System.out.println(ans);
		}
		
		






	}
}
