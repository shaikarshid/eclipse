package Rough;

public class Student1 {
	int id;
	String name;


	Student1 (int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "id :"+id+" name:"+name;
	}
}
