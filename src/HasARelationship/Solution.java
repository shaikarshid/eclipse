package HasARelationship;


class College1
{
	String collegeName="audisankara";
	Student1 s=new Student1();
}

class Student1 
{
	String name="arshid";
	int id=123;
	Pen1 p=new Pen1();

}
class Pen1
{
	String  name="cello";
	int cost=10;
}

public class Solution {
	
	public static void main(String[] args) {
		
		College1 c=new College1();
		
		System.out.println(c.collegeName);
		
		System.out.println(c.s.id);
		System.out.println(c.s.name);
		
		
		System.out.println(c.s.p.name);
		System.out.println(c.s.p.cost);	
		
		
		

	}
}
/**
 * HasARelationship  : one object associate with another object is called  HasARelationship.
 * */
