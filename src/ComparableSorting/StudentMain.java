package ComparableSorting;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {


		Student s=new Student(1, "chill", 43.0);
		Student s1=new Student(2, "Ant", 44.0);
		Student s2=new Student (3,"bat",54.0);


		ArrayList<Student > a=new ArrayList();

		a.add(s);
		a.add(s1);
		a.add(s2);
		
		Collections.sort(a);   /// collection class mey *****
	
		for(Student i:a)
		{
			System.out.println(i);
		}
		
	}
}
