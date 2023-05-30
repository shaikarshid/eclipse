package Rough;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stud1Main {
	public static void main(String[] args) 
	{

		Student1 s=new Student1(4,"arshid");
		Student1  s1= new Student1(9,"vamsi");

		//		ArrayList<Student1> a=new ArrayList<Student1>();
		//		a.add(s);
		//		a.add(s1);
		//		System.out.println(a);
		//		

		//OR
		
		Student1[] sr= {s,s1};
		ArrayList<Student1> a=new ArrayList<Student1>();
		for(int i=0;i<sr.length;i++)
		{
			System.out.println(a.add(sr[i]));
		}
		System.out.println(a);

	}
}
