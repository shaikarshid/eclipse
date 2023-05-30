package String;
                         //without String class
public class Student
{
	public static void main(String[] args) {

		Student s=new Student();
		System.out.println(s);//toString()
		
		
		System.out.println(s.hashCode());//hashcode()
		
		Student s1=new Student();
		Student s2= new Student();
		System.out.println(s1.equals(s2));
	}
}
