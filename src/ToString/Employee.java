package ToString;

public class Employee
{
	String name;
	int sal;
	String domain;

	Employee(String name,int sal,String domain)
	{
		this.name=name;
		this.sal=sal;
		this.domain=domain;
	}
	@Override
	public String toString()
	{
		return "name: "+name+" sal:"+sal+" domain:"+domain;
	}
}
