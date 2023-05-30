package ComparatorSorting;

public class Student {
	Integer id;
	String name;
	Double marks;
	
	Student(Integer id,String name,Double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString()
	{
		return "id: "+id+" name : "+name+" marks: "+marks;
		
	}

}
