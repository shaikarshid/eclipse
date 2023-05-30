package Rough;

public class Empoyrr extends Student
{
	String job;
	
	Empoyrr(int age,String name,String job)
	{
		super(age,name);

		this.job=job;
	}

	
	
	public String toString()
	{
		return age+""+name+""+ job;
	}
}
