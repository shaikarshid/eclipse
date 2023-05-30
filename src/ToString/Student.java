package ToString;

public class Student 
{
	int age ;
	String name;
	Student(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "age:"+age+" name:"+name;
	}
}





/** NOTES :
 *             toString will return the String resprestation of Object.
 *             SYNTAX:
 *                        public String toString()
 *                         {
 *                             return;
 *                         }
 *                              
 *                              */
