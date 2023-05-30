package String;
//with String class
public class Student1 {
public static void main(String[] args) {
	
	String s=new String("a");
	System.out.println(s);
	
	
	
	System.out.println(s.hashCode());
	String s2=new String("a");
	
	System.out.println(s.equals(s2));
	System.out.println(s==s2      );
}
}
