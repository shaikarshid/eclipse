package Equals;

public class Person
{
	int  age;
	String name;
	double sal;
	char gender;

	Person(int age,String name,double sal,char gender)
	{
		this.age=age;
		this.name=name;
		this.sal=sal;
		this.gender=gender;

	}

	@Override
	public String toString()
	{
		return "name: "+ name+" age:"+age+" sal:"+sal+" gender:"+gender;
	}

	// 3Rules..
	@Override     
	public boolean equals(Object obj)// upcasting
	{
		Person p=(Person)obj;//downcasting 
		
		return   this.name.equals(p.name);          // comparing logic
		
//		return   this.age==p.age; 
		
//		return this.sal == p.sal;
		
//		return this.gender==p.gender;
	}

}
// Stiring ku ekich .equals use karna remaining sab so == use karna ..agar
//sabhiii wrapper variables haito .equals use karle ja 
// 