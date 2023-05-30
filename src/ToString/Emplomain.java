package ToString;

public class Emplomain
{
	public static void main(String[]args)
	{
		Employee e=new Employee("javeed",9000,"Software");
		Employee e1=new Employee("sravan",400,"sql");

		//	System.out.println(e);
		//	System.out.println(e1);
		//OR
		Employee[]a= {e,e1};

		for(Employee i: a)//for each loop
		{
			System.out.println(i);
		}
	}

}
