package Equals;

public class Employee {
	String name;
	int id;
	double sal;
	
	Employee(String  name, int id,double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee e=(Employee)obj;
		return this.sal==e.sal;
//		return this.name.equals(e.name);
	}


}
