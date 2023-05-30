package KeySet;


import java.util.Set;
import java.util.TreeMap;

public class StudentMain {
	public static void main(String[] args) {

		Student s1=new Student(1, "bablu");
		Student s2=new  Student(2, "arshid");


		TreeMap<Student, Integer> m = new  TreeMap<>();

		m.put(s1, 99);
		m.put(s2, 88);

		//		System.out.println(m);  //{id 1 name bablu=99, id 2 name arshid=88}

		Set<Student> keys=	m.keySet();
		
		
		for(Student i: keys)	
		{
			System.out.println(i+ " "+ m.get(i));

		}



	}
}