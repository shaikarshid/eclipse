package KeySet;

public class Employee  implements Comparable<Employee>
{

	Integer id;
	String name;
	Double marks;
	
	Employee(Integer id,String name,Double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString()
	{
		return "id:"+id+" name: "+name+" marks: "+marks; 
	}
	
	@Override
	public int compareTo(Employee e)
	{
		return this.name.compareTo(e.name);
	}
}
