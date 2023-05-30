package ComparableSorting;

public class Employee implements Comparable<Employee>
{
     Integer id;
     String name;
     Double sal;
     
     
     Employee(Integer id,String name,Double sal)
     {
    	 this.id=id;
    	 this.name=name;
    	 this.sal=sal;	 
     }
     
	@Override
	public String toString()
	{
		return "id: "+id+" name: "+name+" sal: "+sal;
	}
	
	@Override
	public int compareTo(Employee e)
	{
//		return this.sal.compareTo(e.sal); // assceding order
//		return this.id.compareTo(e.id);// assceding order
//		return this.name.compareTo(e.name);//asscending Order
		
//		return e.sal.compareTo(this.sal); // Descending order
//		return e.id.compareTo(this.id);// Descending order
		return e.name.compareTo(this.name); //DEscending Order
		
		
	}
	
}
