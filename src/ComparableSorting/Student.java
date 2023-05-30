package ComparableSorting;

public class Student  implements Comparable<Student>
{

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
		return "id "+id+" name "+name+" marks "+marks ;
	}
	
	@Override
	public int compareTo(Student s)
	{
		//asscending Order
		return this.id.compareTo(s.id);
//		return this.name.compareTo(s.name);
//		return this.marks.compareTo(s.marks);
		
		//decending  Order
//		return s.id.compareTo(this.id);
//		return s.name.compareTo(this.name);
//		return s.marks.compareTo(this.marks);
	}
}
