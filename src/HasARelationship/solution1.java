package HasARelationship;

class College
{
	String name;
	Student s;

	College(String name,Student s)
	{
		this.name=name;
		this.s=s;
	}
}

class Student
{
	int id;
	String name;
	Pen p;

	Student(int id, String name,Pen p)
	{
		this.id = id;
		this.name = name;
		this.p=p;
	}
}

class Pen
{
	String name;
	int cost;

	public Pen(String name, int cost) {

		this.name = name;
		this.cost = cost;
	}
}

public class solution1 {


	public static void main(String[] args) {


		College c=new College("audisankara",new Student(123,"arshid",new Pen("cello",10)));

		System.out.println(c.name);


		System.out.println(c.s.id);
		System.out.println(c.s.name);

		System.out.println(c.s.p.name);
		System.out.println(c.s.p.cost);	









	}





}
