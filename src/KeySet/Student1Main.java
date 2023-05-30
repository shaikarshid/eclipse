package KeySet;

import java.util.Set;
import java.util.TreeMap;

public class Student1Main {
	public static void main(String[] args) {

		Student1 s1=new Student1(1, "bablu");
		Student1 s2=new Student1(2, "arshid");

		TreeMap<Student1, Integer> t=new TreeMap<>();
		t.put(s1, 99);
		t.put(s2, 76);
		
		Set<Student1> keys=t.keySet();
		
		for(Student1 i: keys)
		{
			System.out.println(i+ "  marks :"+t.get(i));
		}
	}
}
