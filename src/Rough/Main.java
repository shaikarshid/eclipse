package Rough;

public class Main {
	public static void main(String[]args)
	{
//		Student s=new Student (2,"hi");
//		System.out.println(s.age);
//		System.out.println(s.name);
		
//		Empoyrr e=new Empoyrr(1, "bhanu", "lhali");
//		System.out.println(e);
		
		Student se= new Empoyrr(1, "arsgh", "fbb");
		
		Empoyrr e=(Empoyrr)se;
		System.out.println(e.age);
		System.out.println(e.name);
		System.out.println(e.job);
		
		
		
		
	}
	
	
	
}
