package Equals;

public class PersonMain {
public static void main(String[] args) {
	
	Person p=new Person(20,"vamsi",7000.00,'m');
	Person p1=new Person(20,"samantha",4000.00,'f');
	
	System.out.println(p);
	
	System.out.println(p1);
	
	
	System.out.println(p.equals(p1));
}
}
