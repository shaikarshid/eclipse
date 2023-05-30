package KeySet;

import java.util.TreeMap;

public class Student1 implements  Comparable<Student1>
{

	Integer id;
	String name;

	Student1(Integer id,String name)
	{
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student1 s)
	{
//		return this.name.compareTo(s.name);
		return s.name.compareTo(this.name);
	}
	



}

