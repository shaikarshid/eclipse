package ComparableSorting;

import java.util.TreeSet;

public class EmplMain
{

	public static void main(String[] args) {

		Employee e=new Employee(1, "bablu", 9.0);
		Employee e1=new Employee(2,"afridi",10.0);
		Employee e2=new Employee (3,"sravan",8.0);
		
		TreeSet<Employee> t=new TreeSet<Employee>();
		t.add(e);
		t.add(e1);
		t.add(e2);
		
		for(Employee i: t)
		{
			System.out.println(i);
		}


	}
}
