package ComparatorSorting;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain 
{
	public static void main(String[] args) {
		
		
		
		Student s1=new Student(1, "b", 9.0);
		Student s2=new Student(2, "c", 5.0);
		Student s3=new Student(3, "a", 10.0);
		
		
		//Sorting class Objecr creat
		
		SortId id=new SortId();
		SortName name= new SortName();
		SortMarks marks=new SortMarks();
		
		ArrayList<Student> a=new ArrayList();
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		
		Collections.sort(a,name);// sort karnekeliya
		
		
		
		for(Student i:a)
		{
			System.out.println(i);
		}
		
	}

}
